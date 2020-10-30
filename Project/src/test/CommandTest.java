package test;

public class CommandTest
{
    public static void main(String[] args)
    {
        ProcessArray pa = new ProcessArray();
        int[] target = {3,-4,6,4};
        //第一次处理
        pa.process(target,new PrintCommand());
        //第二次处理
        pa.process(target,new AddCommand());
    }
}
