package advanced;

import java.util.*;

public class Library {

    private Map<Genre, Set<Book>> bookShelf;

    public void initWithDefaultBooks() {
        bookShelf = new HashMap<Genre, Set<Book>>();
        Book drama1 = new Book("GG", "Great Gatsby", Genre.DRAMA, 2001);
        final Book horror1 = new Book("MS", "Frankenstein", Genre.HORROR, 1987);
        Book scifi1 = new Book("FH", "Dune", Genre.SCIFI, 1996);

        //v1 to add
        Set<Book> dramaSection = new HashSet<Book>();
        dramaSection.add(drama1);
        bookShelf.put(Genre.DRAMA, dramaSection);

        //v2 to add
        bookShelf.put(horror1.getGenre(), new HashSet<Book>() {{
            add(horror1);
        }});

        // v3 to add
        bookShelf.put(scifi1.getGenre(), new HashSet<Book>(Arrays.asList(scifi1)));
    }

    public Map<Genre, Set<Book>> getBookShelf() {
        return bookShelf;
    }

    public Library() {
        initWithDefaultBooks();
    }
}
