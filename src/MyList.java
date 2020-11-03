import java.util.Arrays;

public class MyList {
    private int size;
    private Object[] data;

   public boolean add(Object e){
       //检查数组是否足够 不够就扩容在放入 ,
       if (size==data.length){
           //扩容
           ensureCapacity(size + 1);
       }
       data[size++]=e;
       return true;
   }

    private void ensureCapacity(int i) {

      data=  Arrays.copyOf( data ,i );
      System.out.println( "数组扩容" );
       //判断是否
    }

    public Object add(int index ,Object e){

       //检查索引是否存在
         checkRange(index);
        //确定添加进去数组够用
        if (size==data.length){
            //扩容
            ensureCapacity(size + 1);
        }
        Object object =data[index];
        data[index]=e;
        //设置值

        return object;
    }

    private void checkRange(int index) {
       if (index>size||index<0){

           throw  new IndexOutOfBoundsException( "索引越界" );
       }
    }
}
