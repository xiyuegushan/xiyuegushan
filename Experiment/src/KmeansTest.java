import java.util.ArrayList;

public class KmeansTest {
    public  static void main(String[] args)
    {
        //初始化一个Kmean对象，将k置为10
        Kmeans k=new Kmeans(3);
        ArrayList<double[]> dataSet=new ArrayList<double[]>();

        dataSet.add(new double[]{3.45,7.08});
        dataSet.add(new double[]{1.76,7.24});         
        dataSet.add(new double[]{4.29,9.55});
        dataSet.add(new double[]{3.35,6.65});
        dataSet.add(new double[]{3.17,6.41});
        dataSet.add(new double[]{3.68,5.99});
        dataSet.add(new double[]{2.11,4.08});
        dataSet.add(new double[]{2.58,7.10});
        dataSet.add(new double[]{3.45,7.88});
        dataSet.add(new double[]{6.17,5.40});
        dataSet.add(new double[]{4.20,6.46});
        dataSet.add(new double[]{5.87,3.87});
        dataSet.add(new double[]{5.47,2.21});
        dataSet.add(new double[]{5.97,3.62});
        dataSet.add(new double[]{6.24,3.06});
        dataSet.add(new double[]{6.89,2.41});
        dataSet.add(new double[]{5.38,2.32});
        dataSet.add(new double[]{5.13,2.73});
        dataSet.add(new double[]{7.26,4.19});
        dataSet.add(new double[]{6.32,3.62});
        
        //设置原始数据集
        k.setDataSet(dataSet);
        //执行算法
        k.execute();
        //得到聚类结果
        ArrayList<ArrayList<double[]>> cluster=k.getCluster();
        //查看结果
        for(int i=0;i<cluster.size();i++)
        {
            k.printDataArray(cluster.get(i), "cluster["+i+"]");
        }

    }
}