package com.zxk.basis.list;

/**
 * 单链表
 */
public class LinkList<T> {
    //节点类
    private class Node {
        private T data;
        private Node next;

        public Node() {
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    //指向链表头节点的引用变量
    private Node head;
    //指向链表尾节点的引用变量
    private Node tail;
    //链表中当前总节点数
    int size;

    //生成链表对象是一个空表
    public LinkList() {
        head = null;
        tail = null;
    }

    //生成链表对象时有一个头节点 （有参构造器）
    public LinkList(T data) {
        //指定一个头节点的数据域值为data,不指向其他节点
        head = new Node(data, null);
        tail = head;
        size++;
    }

    //返回链表的长度
    public int length() {
        return size;
    }

    //获取指定位置的元素
    public T getElement(int index) {
        return findNodeByIndex(index).data;
    }

    //查找指定索引位置的节点
    public Node findNodeByIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("线性表索引越界");
        }
        //从头节点开始下移遍历
        Node current = head;
        for (int i = 0; i < size && current.next != null; i++, current = current.next) {
            if (i == index) {
                return current;
            }
        }
        return null;
    }

    //查找指定元素的位置(查找数据域存放的是element的节点位置)
    public int findIndexByElement(T element) {
        //从第一个节点开始查找对比数据
        Node current = head;
        for (int i = 0; i < size && current.next != null; i++, current = current.next) {
            if (current.data.equals(element)) return i;
        }
        return -1;
    }

    //插入在指定位置插入一个元素
    public void insert(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("线性表索引越界");
        }
        //如果链表为空，直接调用add方法
        if (head == null) {
            add(element);
        } else {
            //链表不为空时
            //在链表头插入
            if (index == 0) {
                addAtHead(element);
            } else {
                //找到要插入位置的前一个节点
                Node prev = findNodeByIndex(index - 1);
                //插入后prev的next指向新节点，新节点的next指向原来prev的下一个节点
                prev.next = new Node(element, prev.next);
                size++;
            }
        }

    }

    //插入 尾插法在每次在链表尾添加新节点
    public void add(T element) {
        if (head == null) {
            head = new Node(element, null);
            tail = head;
        } else {
            Node newNode = new Node(element, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //插入 头插法在链表头部加入新节点
    public void addAtHead(T element) {
        //在头部插入新节点，就是让新节点的next指向原来的head,让新节点作为链表的头节点
        head = new Node(element, head);
        //newNode.next = head;
        //head = newNode;
        //如果插入之前是空链表
        if (tail == null) {
            tail = head;
        }
    }

    //删除指定位置的节点 返回删除节点中的元素值
    public T delete(int index) {
        Node deleteNode = null;
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("线性表索引越界");
        }
        //删除头节点
        if (index == 0) {
            deleteNode = head;
            head = head.next;
        } else {
            //获取要删除的节点的前一个节点
            Node prev = findNodeByIndex(index - 1);
            //要删除的节点就是prev的next指向的节点
            deleteNode = prev.next;
            //删除以后prev的next指向被删除节点之前所指向的next
            prev.next = deleteNode.next;

            deleteNode.next = null;
        }
        return deleteNode.data;

    }

    //删除  链表中最后一个元素
    public T removeLast() {
        return delete(size - 1);
    }

    //清除链表中所有的元素
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    //判断链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        //链表的输出  重写toString方法
        if (isEmpty()) {
            return "[]";
        } else {
            //使用StringBuilder类
            StringBuilder sb = new StringBuilder("[");
            //从head开始遍历
            for (Node current = head; current != null; current = current.next) {
                //把节点的数据拼接起来
                sb.append(current.data.toString() + ",");
            }
            int len = sb.length();
            //把最后一个元素的，删除然后加上]
            return sb.delete(len - 1, len).append("]").toString();
        }
    }

    public static void main(String[] args) {
        LinkList<String> list = new LinkList<>();
        list.add("zxk");
        list.add("hp");
        System.out.println(list);
    }
}