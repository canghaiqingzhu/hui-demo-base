package com.xiehui93.arithmetic;
/**
 * @Title: BubbleSorting.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(冒泡排序) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月14日 上午10:11:47 
 * @version V1.0 
 * 冒泡排序（Bubble Sort）是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
冒泡排序算法的运作如下:
 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 针对所有的元素重复以上的步骤，除了最后一个。
 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。   
 */
public class BubbleSorting {

	public static void main(String[] args) {
		int score[] = {67, 69, 75, 87, 89, 90, 99, 100};
		for (int i = 0; i < score.length -1; i++){    //最多做n-1趟排序
			for(int j = 0 ;j < score.length - i - 1; j++){    //对当前无序区间score[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)
				if(score[j] < score[j + 1]){    //把小的值交换到后面
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}            
			System.out.print("第" + (i + 1) + "次排序结果：");
			for(int a = 0; a < score.length; a++){
				System.out.print(score[a] + "\t");
			}
			System.out.println("");
		}
		System.out.print("最终排序结果：");
		for(int a = 0; a < score.length; a++){
			System.out.print(score[a] + "\t");
		}

	}

}
