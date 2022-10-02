package _04_JavaOOP._10_TestDrivenDevelopmentExercise.main.java;

import java.util.*;
import java.util.stream.Collectors;

public class ChainblockImpl implements Chainblock{
    private Map<Integer,Transaction> transactionMap;

    public ChainblockImpl(){
        this.transactionMap = new LinkedHashMap<>();
    }

    public int getCount() {
        return this.transactionMap.size();
    }

    public void add(Transaction transaction) {
        this.transactionMap.putIfAbsent(transaction.getId(),transaction);
    }

    public boolean contains(Transaction transaction) {
        return this.contains(transaction.getId());
    }

    public boolean contains(int id) {
        return this.transactionMap.containsKey(id);
    }

    public void changeTransactionStatus(int id, TransactionStatus newStatus) {
        this.getById(id).setStatus(newStatus);
    }

    public void removeTransactionById(int id) {
        this.transactionMap.remove(this.getById(id).getId());

    }

    public Transaction getById(int id) {
        if(!this.contains(id)){
            throw new IllegalArgumentException();
        }
        return this.transactionMap.get(id);
    }

    public Iterable<Transaction> getByTransactionStatus(TransactionStatus status) {
        List<Transaction> filteredTransactions = new ArrayList<>();
        for(Transaction transaction : transactionMap.values()){
            if(transaction.getStatus().equals(status)){
                filteredTransactions.add(transaction);
            }
        }
        transactionMap.values().stream().filter(t -> t.getStatus().equals(status)).collect(Collectors.toList());
        if(filteredTransactions.size() == 0){
            throw new IllegalArgumentException();
        }
        return filteredTransactions.stream().sorted(Comparator.comparing(Transaction::getAmount).reversed()).collect(Collectors.toList());
    }




    public Iterable<String> getAllSendersWithTransactionStatus(TransactionStatus status) {
        return null;
    }

    public Iterable<String> getAllReceiversWithTransactionStatus(TransactionStatus status) {
        return null;
    }

    public Iterable<Transaction> getAllOrderedByAmountDescendingThenById() {
        return null;
    }

    public Iterable<Transaction> getBySenderOrderedByAmountDescending(String sender) {
        return null;
    }

    public Iterable<Transaction> getByReceiverOrderedByAmountThenById(String receiver) {
        return null;
    }

    public Iterable<Transaction> getByTransactionStatusAndMaximumAmount(TransactionStatus status, double amount) {
        return null;
    }

    public Iterable<Transaction> getBySenderAndMinimumAmountDescending(String sender, double amount) {
        return null;
    }

    public Iterable<Transaction> getByReceiverAndAmountRange(String receiver, double lo, double hi) {
        return null;
    }

    public Iterable<Transaction> getAllInAmountRange(double lo, double hi) {
        return this.transactionMap.values().stream().filter(t -> t.getAmount() >= lo && t.getAmount() <= hi).collect(Collectors.toList());
    }

    public Iterator<Transaction> iterator() {
        return null;
    }
}
