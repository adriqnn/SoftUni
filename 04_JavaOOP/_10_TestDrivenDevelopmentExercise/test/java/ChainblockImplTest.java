package _04_JavaOOP._10_TestDrivenDevelopmentExercise;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChainblockImplTest {
    private Chainblock chainBlock;
    private List<Transaction> transactions;

    @Before
    public void prepare(){
       this.chainBlock = new ChainblockImpl();
       this.transactions = new ArrayList<>();
       prepareTransactions();
    }

    private void prepareTransactions(){
        Transaction transaction = new TransactionImpl(0, TransactionStatus.SUCCESSFUL, "Pesho", "Toshko", 10.20);
        Transaction transaction1 = new TransactionImpl(1, TransactionStatus.SUCCESSFUL, "Pesho", "Toshko", 9.00);
        Transaction transaction2 = new TransactionImpl(2, TransactionStatus.UNAUTHORIZED, "Sasho", "Pesho", 11.00);
        Transaction transaction3 = new TransactionImpl(3, TransactionStatus.FAILED, "Tasho", "Toshko", 12.20);
        
        this.transactions.add(transaction);
        this.transactions.add(transaction1);
        this.transactions.add(transaction2);
        this.transactions.add(transaction3);
    }

    private void fillChainBlockWithTransactions(){
        this.transactions.forEach(e -> this.chainBlock.add(e));
    }

    @Test
    public void testContainsReturnTrue(){
        Transaction transaction = this.transactions.get(0);
        this.chainBlock.add(transaction);
        Assert.assertTrue(this.chainBlock.contains(transaction));
    }

    @Test
    public void testContainsReturnFalse(){
        Transaction transaction = this.transactions.get(0);
        Assert.assertFalse(this.chainBlock.contains(transaction));
    }

    @Test
    public void testContainsByIdReturnsTrue(){
        Transaction transaction = this.transactions.get(0);
        this.chainBlock.add(transaction);
        Assert.assertTrue(this.chainBlock.contains(0));
    }

    @Test
    public void testContainsByIdReturnsFalse(){
        Assert.assertFalse(this.chainBlock.contains(0));
    }

    @Test
    public void testAddCorrectTransaction(){
        this.chainBlock.add(this.transactions.get(0));
        Assert.assertEquals(1, this.chainBlock.getCount());
        this.chainBlock.add(this.transactions.get(1));
        Assert.assertEquals(2, this.chainBlock.getCount());
    }

    @Test
    public void testAddTransactionFailTwoTimesSame(){
        this.chainBlock.add(this.transactions.get(0));
        this.chainBlock.add(this.transactions.get(0));
        
        Assert.assertEquals(1, this.chainBlock.getCount());
    }

    @Test
    public void testGetCount(){
        Assert.assertEquals(0, this.chainBlock.getCount());
        this.chainBlock.add(this.transactions.get(0));
        Assert.assertEquals(1, this.chainBlock.getCount());
        this.chainBlock.add(this.transactions.get(1));
        Assert.assertEquals(2, this.chainBlock.getCount());
        this.chainBlock.add(this.transactions.get(2));
        Assert.assertEquals(3, this.chainBlock.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveInvalidTransaction(){
        this.chainBlock.changeTransactionStatus(-100, TransactionStatus.ABORTED);
    }

    @Test
    public void testChangeTransactionStatusSuccess(){
        this.chainBlock.add(this.transactions.get(0));
        this.chainBlock.changeTransactionStatus(0, TransactionStatus.UNAUTHORIZED);
        Assert.assertEquals(TransactionStatus.UNAUTHORIZED, this.chainBlock.getById(0).getStatus());
    }

    @Test
    public void testGetByIdSuccess(){
        fillChainBlockWithTransactions();
        Transaction actualTransaction = this.chainBlock.getById(0);
        Assert.assertEquals(0, actualTransaction.getId());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetByIdFail(){
        this.chainBlock.getById(-10);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveTransactionWithInvalidId(){
        fillChainBlockWithTransactions();
        this.chainBlock.removeTransactionById(-10);
    }

    @Test
    public void removeTransactionByIdSuccess(){
        fillChainBlockWithTransactions();
        this.chainBlock.removeTransactionById(0);
        Assert.assertFalse(this.chainBlock.contains(0));
        Assert.assertEquals(3, this.chainBlock.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByTransactionStatusWithWrongStatus(){
        this.chainBlock.getByTransactionStatus(TransactionStatus.SUCCESSFUL);
    }

    @Test
    public void testGetByTransactionStatusSuccess(){
        this.transactions.sort(Comparator.comparing(Transaction::getAmount).reversed());
        fillChainBlockWithTransactions();
        List<Transaction> successfulSortedTransactions = this.transactions.stream().filter(t -> t.getStatus().equals(TransactionStatus.SUCCESSFUL)).collect(Collectors.toList());
        Iterable<Transaction> actualSortedTransactions = this.chainBlock.getByTransactionStatus(TransactionStatus.SUCCESSFUL);
        List<Transaction> actualSortedTransactionsList = new ArrayList<>();
        actualSortedTransactions.forEach(actualSortedTransactionsList::add);
        Assert.assertEquals(successfulSortedTransactions, actualSortedTransactionsList);
    }

    @Test
    public void getAllInAmountRangeSuccess(){
        fillChainBlockWithTransactions();
        Iterable<Transaction> resultTransactions = this.chainBlock.getAllInAmountRange(10, 12);
        resultTransactions.forEach(e -> {
            Assert.assertTrue(e.getAmount() >= 10);
            Assert.assertTrue(e.getAmount() <= 12);
        });
    }

    @Test
    public void getAllInAmountRangeEmptyResult(){
        fillChainBlockWithTransactions();
        Iterable<Transaction> resultTransactions = this.chainBlock.getAllInAmountRange(-100, -50);
        List<Transaction> resultList = new ArrayList<>();
        resultTransactions.forEach(resultList::add);
        Assert.assertTrue(resultList.isEmpty());
    }
}
