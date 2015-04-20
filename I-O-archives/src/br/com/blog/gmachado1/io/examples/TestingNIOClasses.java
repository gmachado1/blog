package br.com.blog.gmachado1.io.examples;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;

public class TestingNIOClasses extends SimpleFileVisitor<Path> {


	public static void main(String args[]) {

		exemple1();
		exemple2();
		exemple3();
		exemple4();
		exemple5();
		exemple6();
		exemple7();

	}

	private static void exemple1() {
		Path p1 = Paths.get("/tmp/blog/file1.txt");// on UNIX
		// Path p2 = Paths.get("c:\\temp\\test");// On Windows
		Path p3 = Paths.get("/tmp", "file1.txt"); // same as p1
		// Path p4 = Paths.get("c:", "temp", "test"); // same as p2
		Path p5 = Paths.get("/tmp", "blog", "test.txt"); // also same as p1
		// Path p6 = Paths.get("c:\\temp", "test") ; // also same as p2

		Path p7 = Paths.get("files", "nio", "surfers.txt"); // also same as p1

		System.out.println(Files.exists(p7));
		do {
			int i = 0;
			try {
				Files.createFile(p7);// create a file!
			} catch (NoSuchFileException e) {
				try {
					p5 = Paths.get("files", "nio");
					Files.createDirectories(p5);
				} catch (IOException e1) {
					i++;
					e1.getMessage();
				}
			} catch (IOException e1) {
				i++;
				if (i > 1) {
					e1.printStackTrace();
					break;
				}
			}
		} while (Files.notExists(p7));
		System.out.println(Files.exists(p7)); // look again

	}

	private static void exemple2() {
		Path source = Paths.get("files", "nio", "surfers.txt");
		Path target = Paths.get("files", "nio2");

		try {
			if (!Files.exists(target))
				Files.createDirectories(target);
			target = Paths.get("files", "nio2", "surfers2.txt");
			Files.copy(source, target);
			Files.delete(target);
			Files.move(source, target);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Path one = Paths.get("/temp/test1");
		Path two = Paths.get("/temp/test2.txt");
		Path targ = Paths.get("/temp/test23.txt");
		try {
			Files.copy(one, targ);
			Files.copy(two, targ);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void exemple3() {
		Path path = Paths.get("/home", "gustavo", "Documents", "workspaces",
				"projetos", "estudos", "I-O-archives", "src", "br", "com",
				"blog", "gmachado1", "io", "examples");
		System.out.println("getFileName: " + path.getFileName());
		System.out.println("getName(1): " + path.getName(3));
		System.out.println("getNameCount: " + path.getNameCount());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getRoot: " + path.getRoot());
		System.out.println("subpath(0, 2): " + path.subpath(0, 4));
		System.out.println("toString: " + path.toString());

		int spaces = 1;

		for (Path subPath : path) {
			System.out.format("%" + spaces + "s%s%n", "", subPath);
			spaces += 2;
		}

		Path dir = Paths.get("files");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir,
				"[no]*")) {
			// use try with resources
			// so we don't have close()
			for (Path path2 : stream)
				System.out.println(path2.getFileName());
			// loop through the stream
		} catch (Exception e) {
		}

	}

	private static void exemple4() {
		System.out.println(Paths.get("/a/./b/./c").normalize());
		System.out.println(Paths.get(".classpath").normalize());
		System.out.println(Paths.get("/a/b/c/..").normalize());
		System.out.println(Paths.get("../a/b/c").normalize());

		Path dir = Paths.get("/home/java");
		Path file = Paths.get("models/Model.pdf");
		Path result = dir.resolve(file);
		System.out.println("result = " + result);

		Path absolute = Paths.get("/home/java");
		Path relative = Paths.get("dir");
		Path file1 = Paths.get("Model.pdf");
		System.out.println("resolve - 1: " + absolute.resolve(relative));
		System.out.println("resolve - 2: " + absolute.resolve(file1));
		System.out.println("resolve - 3: " + relative.resolve(file1));
		System.out.println("resolve - 4: " + relative.resolve(absolute));
		System.out.println("resolve - 5: " + file1.resolve(absolute));
		System.out.println("resolve - 6: " + file1.resolve(relative));

		Path absolute1 = Paths.get("/home/java");
		Path absolute2 = Paths.get("/usr/local");
		Path absolute3 = Paths.get("/home/java/temp/music.mp3");
		Path relative1 = Paths.get("temp");
		Path relative2 = Paths.get("temp/music.pdf");
		System.out.println("relativize-1:" + absolute1.relativize(absolute3));
		System.out.println("relativize-2:" + absolute3.relativize(absolute1));
		System.out.println("relativize-3:" + absolute1.relativize(absolute2));
		System.out.println("relativize-4:" + relative1.relativize(relative2));
		try {
			System.out.println("relativize-5:"
					+ absolute3.relativize(relative1));
		} catch (Exception e) {
			System.out.println("Error known");
		}
		// não consegue saber de onde parte o relativo para comparar com o
		// absoluto
		// can't know how to compare the absolute with the relative to decribe
		// the return
	}

	private static void exemple5() {

		Date jan = new GregorianCalendar(2015, Calendar.JANUARY, 28).getTime();
		// old
		File file = new File("files/nio/goldCoast");
		// new
		Path path = Paths.get("files/nio2/goldCoast");
		try {
			// old way
			file.createNewFile();
			file.setLastModified(jan.getTime());
			System.out.println(file.lastModified());
			file.delete();

			// new way
			Files.createFile(path);
			FileTime fileTime = FileTime.fromMillis(jan.getTime());
			Files.setLastModifiedTime(path, fileTime);
			System.out.println(Files.getLastModifiedTime(path));
			Files.delete(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(Files.isExecutable(path));
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isWritable(path));

		BasicFileAttributes basic;
		try {
			basic = Files.readAttributes(path, BasicFileAttributes.class);
			System.out.println("create: " + basic.creationTime());
			System.out.println("access: " + basic.lastAccessTime());
			System.out.println("modify: " + basic.lastModifiedTime());
			System.out.println("directory: " + basic.isDirectory());

			FileTime lastUpdated = basic.lastModifiedTime();
			FileTime created = basic.creationTime();
			FileTime now = FileTime.fromMillis(System.currentTimeMillis());
			BasicFileAttributeView basicView = Files.getFileAttributeView(path,
					BasicFileAttributeView.class);
			basicView.setTimes(lastUpdated, now, created);
			DOSAttributes();
			POSAttributes();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void POSAttributes() {
		Path path = Paths.get("files/nio/pos-surf.txt");
		try {
			Files.createFile(path);
			PosixFileAttributes posix = Files.readAttributes(path,
					PosixFileAttributes.class);
			//
			Set<PosixFilePermission> perms = PosixFilePermissions
					.fromString("rw-r--r--"); //
			Files.setPosixFilePermissions(path, perms);
			//
			System.out.println(posix.permissions());
		} catch (Exception e) {
		}

	}

	private static void DOSAttributes() {
		Path path = Paths.get("files/nio/win-surf.txt");
		try {
			Files.createFile(path);
			// create file
			Files.setAttribute(path, "dos:hidden", true);
			// set attribute
			Files.setAttribute(path, "dos:readonly", true);
			// another one
			DosFileAttributes dos = Files.readAttributes(path,
					DosFileAttributes.class);
			// dos attributes
			System.out.println(dos.isHidden());
			System.out.println(dos.isReadOnly());
			Files.setAttribute(path, "dos:hidden", false);
			Files.setAttribute(path, "dos:readonly", false);
			// or
			/**
			 * DosFileAttributeView view =
			 * Files.getFileAttributeView(path,DosFileAttributeView.class);
			 * view.setHidden(true); view.setReadOnly(true);
			 **/
			dos = Files.readAttributes(path, DosFileAttributes.class);
			// get attributes again
			System.out.println(dos.isHidden());
			System.out.println(dos.isReadOnly());
			Files.delete(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void exemple6() {
		TestingNIOClasses dirs = new TestingNIOClasses();
		try {
			Path path = Paths.get("/home", "gustavo", "Documents",
					"workspaces", "projetos", "estudos", "I-O-archives", "bin");
			Files.walkFileTree(path, dirs);
			// kick off recursive check starting point
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
			throws IOException {
		System.out.println("file: " + file);
		if (file.getFileName().toString().startsWith("Con")) {
			System.out.println("file: " + file);
			Files.delete(file);
		}
		return FileVisitResult.CONTINUE;
	}

	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		System.out.println("pre: " + dir);
		if (dir.getFileName().toString().equals("ch")) {
			return FileVisitResult.SKIP_SUBTREE;
		}
		return FileVisitResult.CONTINUE;
	}

	public FileVisitResult visitFileFailed(Path file, IOException exc) {
		System.out.println("fail: " + file);
		return FileVisitResult.CONTINUE;
	}

	public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
		System.out.println("post: " + dir);
		return FileVisitResult.CONTINUE;
	}

	private static void exemple7() {
		Path path = Paths.get("/home", "gustavo", "Documents", "workspaces",
				"projetos", "estudos", "I-O-archives", "bin");
		try {
			WatchService watcher = FileSystems.getDefault().newWatchService();
			path.register(watcher, ENTRY_DELETE);

			while (true) {
				WatchKey key;
				try {
					key = watcher.take();
				} catch (InterruptedException x) {
					return;
				}
				for (WatchEvent<?> event : key.pollEvents()) {
					WatchEvent.Kind<?> kind = event.kind();
					System.out.println(kind.name());
					System.out.println(kind.type());
					System.out.println(event.context());
					String name = event.context().toString();
					if (name.toString().equals("ch")) {
						System.out
								.format("Directory deleted, now we can proceed");
						return;
					}
				}
				key.reset();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
