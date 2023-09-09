package ch04.home;

public class Queue<E> {

	public static class EmptyGqueueException extends RuntimeException {
		public EmptyGqueueException() { }
	}

	public static class OverflowGqueueException extends RuntimeException {
		public OverflowGqueueException() { }
	}

	private E[] que;
	private int capacity;
	private int num;
	private int front;
	private int rear;

	public Queue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = (E [])new Object[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	public E enque(E x) throws OverflowGqueueException {
		if (num >= capacity)
			throw new OverflowGqueueException();
		que[rear++] = x;
		num++;
		if (rear == capacity)
			rear = 0;
		return x;
	}

	public E deque() throws EmptyGqueueException {
		if (num <= 0)
			throw new EmptyGqueueException();
		E x = que[front++];
		num--;
		if (front == capacity)
			front = 0;
		return x;
	}

	public E peek() throws EmptyGqueueException {
		if (num <= 0)
			throw new EmptyGqueueException();
		return que[front];
	}

	public int indexOf(E x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % capacity].equals(x))
				return i + front;
		return -1;
	}

	public int search(E x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % capacity].equals(x))
				return i + 1;
		return -1;
	}

	public void clear() {
		num = front = rear = 0;
	}

	public int getCapacity() {
		return capacity;
	}

	public int size() {
		return num;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= capacity;
	}

	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % capacity].toString() + " ");
			System.out.println();
		}
	}
}
