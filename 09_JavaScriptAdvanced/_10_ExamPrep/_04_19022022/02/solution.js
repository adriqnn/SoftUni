class LibraryCollection{

    constructor(capacity){
        this.capacity = capacity;
        this.books = [];
    }

    addBook(bookName, bookAuthor){
        if(this.books.length >= this.capacity){
            throw new Error("Not enough space in the collection.")
        }

        this.books.push({
            bookName: bookName,
            bookAuthor: bookAuthor,
            payed: false
        })
        return `The ${bookName}, with an author ${bookAuthor}, collect.`;
    }

    payBook(bookName){
        const book = this.books.find(book => book.bookName == bookName);
        if(!book){
            throw new Error(`${bookName} is not in the collection.`);
        }
        if(book.payed == true){
            throw new Error(`${bookName} has already been paid.`);
        }
        book.payed = true;
        return `${bookName} has been successfully paid.`;
    }

    removeBook(bookName){
        const book = this.books.find(book => book.bookName == bookName);
        if(!book){
            throw new Error(`The book, you're looking for, is not found.`);
        }
        if(book.payed == false){
            throw new Error(`${bookName} need to be paid before removing from the collection.`);
        }
        const bookIndex = this.books.findIndex(book => book.bookName == bookName);
        this.books.splice(bookIndex, 1);

        return `${bookName} remove from the collection.`
    }

    getStatistics(bookAuthor){
        let returnStringArray = [];
        if(!bookAuthor){
            returnStringArray.push(`The book collection has ${this.capacity - this.books.length} empty spots left.`);
            returnStringArray.push(this.books.sort((a,b) => a.bookName.localeCompare(b)).map(book => `${book.bookName} == ${book.bookAuthor} - ${book.payed ? 'Has Paid' : 'Not Paid'}.`).join('\n'));
        }else{
            const book = this.books.find(book => book.bookAuthor = bookAuthor);
            if(!book){
                throw new Error (`${bookAuthor} is not in the collection.`);
            }
            returnStringArray.push(this.books.filter(book => book.bookAuthor == bookAuthor).map(book => `${book.bookName} == ${book.bookAuthor} - ${book.payed ? 'Has Paid' : 'Not Paid'}.`).join('\n'));
        }

        return returnStringArray.join('\n');
    }
}

// const library = new LibraryCollection(2)
// console.log(library.addBook('In Search of Lost Time', 'Marcel Proust'));
// console.log(library.addBook('Don Quixote', 'Miguel de Cervantes'));
// console.log(library.addBook('Ulysses', 'James Joyce'));

const library = new LibraryCollection(2)
library.addBook('In Search of Lost Time', 'Marcel Proust');
console.log(library.payBook('In Search of Lost Time'));
console.log(library.payBook('Don Quixote'));

// const library = new LibraryCollection(2)
// library.addBook('In Search of Lost Time', 'Marcel Proust');
// library.addBook('Don Quixote', 'Miguel de Cervantes');
// library.payBook('Don Quixote');
// console.log(library.removeBook('Don Quixote'));
// console.log(library.removeBook('In Search of Lost Time'));


// const library = new LibraryCollection(2)
// console.log(library.addBook('Don Quixote', 'Miguel de Cervantes'));
// console.log(library.getStatistics('Miguel de Cervantes'));

// const library = new LibraryCollection(5)
// library.addBook('Don Quixote', 'Miguel de Cervantes');
// library.payBook('Don Quixote');
// library.addBook('In Search of Lost Time', 'Marcel Proust');
// library.addBook('Ulysses', 'James Joyce');
// console.log(library.getStatistics());



