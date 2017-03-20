public class printerQueue {
    LinkList linkList = new LinkList();

    public void enQueue(String toAdd) {
        linkList.addLast(toAdd);
    }

    public boolean isEmpty() {
        if(linkList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return linkList.size();
    }

    public String deQueue() {
        String output = linkList.first.toAdd;
        linkList.removeFirst();
        return output;
    }

}
