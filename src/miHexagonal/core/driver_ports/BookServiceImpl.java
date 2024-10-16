package miHexagonal.core.driver_ports;

import miHexagonal.core.domain.Book;

public class BookServiceImpl implements BookService {
	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public Book getBook(Long id) {
		return bookRepository.findById(id);
	}
}
