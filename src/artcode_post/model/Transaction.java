package artcode_post.model;

import java.util.Date;

/**
 * Created by macaque on 02.07.2016.
 */
public class Transaction {

    private int id;
    private Item[] items;
    private int count;
    private Address fromAddress;
    private Address currentAddress;
    private Address toAddress;

    private MyDate creationDate;
    private MyDate fromAddressTime;
    private MyDate currPointArrTime;
    private MyDate estimationToTime;
    private MyDate arrivedToTime;

    private TransactionStatus status;

    public Transaction(int id, Address fromAddress, Address currentAddress, Address toAddress,
                       MyDate creationDate, MyDate fromAddressTime, MyDate estimationToTime) {
        this.id = id;
        this.fromAddress = fromAddress;
        this.currentAddress = currentAddress;
        this.toAddress = toAddress;
        this.creationDate = creationDate;
        this.fromAddressTime = fromAddressTime;
        this.estimationToTime = estimationToTime;

    }

    public MyDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(MyDate creationDate) {
        this.creationDate = creationDate;
    }

    public MyDate getFromAddressTime() {
        return fromAddressTime;
    }

    public void setFromAddressTime(MyDate fromAddressTime) {
        this.fromAddressTime = fromAddressTime;
    }

    public MyDate getCurrPointArrTime() {
        return currPointArrTime;
    }

    public void setCurrPointArrTime(MyDate currPointArrTime) {
        this.currPointArrTime = currPointArrTime;
    }

    public MyDate getEstimationToTime() {
        return estimationToTime;
    }

    public void setEstimationToTime(MyDate estimationToTime) {
        this.estimationToTime = estimationToTime;
    }

    public MyDate getArrivedToTime() {
        return arrivedToTime;
    }

    public void setArrivedToTime(MyDate arrivedToTime) {
        this.arrivedToTime = arrivedToTime;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public Address getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(Address fromAddress) {
        this.fromAddress = fromAddress;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Address getToAddress() {
        return toAddress;
    }

    public void setToAddress(Address toAddress) {
        this.toAddress = toAddress;
    }

    private void addItem(Item item){
        items[count] = item;
        count++;
    }
}
