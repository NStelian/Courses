package ro.itschool.mvnbase.curs16;

import java.nio.file.AccessDeniedException;

public class CheckedExceptionMain {
    public static void main(String[] args) throws AccessDeniedException {
        throwCkeckedException();
    }

    private static void throwCkeckedException() throws AccessDeniedException {
        throw new AccessDeniedException("this is checked");
    }
}
