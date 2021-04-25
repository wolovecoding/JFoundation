package Container.List.ArrayList_Mode;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/18 11:03
 */

/*
* public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
{
*  transient Object[] elementData; //   相当于  = null
*  private int size;  //相当于size = 0；
*   private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};  //创建了一个数组 ，0个空间

*
*
*   public ArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;   //   this.elementData ={}
    }

*   把不关键代码删除了  ，
*   public ArrayList(int initialCapacity) {
            this.elementData = new Object[initialCapacity];  //分配指定大小的空间
    }

*     public boolean add(E e) {   //在末尾添加     只扩容了一个容量
        modCount++;   //   数组的个数
        add(e, elementData, size);
        return true;
    }
        * private void add(E e, Object[] elementData, int s) {
            if (s == elementData.length)     //保险，
                elementData = grow();     //容量不够了，扩容
                elementData[s] = e;
                size = s + 1;
            }
            *   private Object[] grow(int minCapacity) {
                    return elementData = Arrays.copyOf(elementData,
                                                       newCapacity(minCapacity));
                }
*
*     public int size() {
        return size;
    }

*     public E get(int index) {
        Objects.checkIndex(index, size);   //检查是否越界，和处理方式   不看
        return elementData(index);
    }
    *         E elementData(int index) {
                    return (E) elementData[index];
                }
*
*
*
*     public Iterator<E> iterator() {
        return new Itr();
    }
    *
    *
* }
*
*
*  private class Itr implements Iterator<E> {
        int cursor;       // 当前位置  默认0
        int lastRet = -1; // 前一个位置

        Itr() {}

        public boolean hasNext() {    //判断有没有元素
            return cursor != size;    //光标是否指向了最后一个元素的后一个位置
        }

        @SuppressWarnings("unchecked")
        public E next() {
            int i = cursor;
            Object[] elementData = ArrayList.this.elementData;
            cursor = i + 1;
            * lastRet = i   //前一个位置也要改
            return (E) elementData[i];
        }
* */
public class DeepRead {
}
