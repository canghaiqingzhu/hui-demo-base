package com.xiehui93.arithmetic;
/**
 * @Title: BubbleSorting.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(ð������) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��14�� ����10:11:47 
 * @version V1.0 
 * ð������Bubble Sort����һ�ּ򵥵������㷨�����ظ����߷ù�Ҫ��������У�һ�αȽ�����Ԫ�أ�������ǵ�˳�����Ͱ����ǽ����������߷����еĹ������ظ��ؽ���ֱ��û������Ҫ������Ҳ����˵�������Ѿ�������ɡ�����㷨��������������ΪԽС��Ԫ�ػᾭ�ɽ������������������еĶ��ˡ�
ð�������㷨����������:
 �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
 ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������
 ������е�Ԫ���ظ����ϵĲ��裬�������һ����
 ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ�   
 */
public class BubbleSorting {

	public static void main(String[] args) {
		int score[] = {67, 69, 75, 87, 89, 90, 99, 100};
		for (int i = 0; i < score.length -1; i++){    //�����n-1������
			for(int j = 0 ;j < score.length - i - 1; j++){    //�Ե�ǰ��������score[0......length-i-1]��������(j�ķ�Χ�ܹؼ��������Χ��������С��)
				if(score[j] < score[j + 1]){    //��С��ֵ����������
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}            
			System.out.print("��" + (i + 1) + "����������");
			for(int a = 0; a < score.length; a++){
				System.out.print(score[a] + "\t");
			}
			System.out.println("");
		}
		System.out.print("������������");
		for(int a = 0; a < score.length; a++){
			System.out.print(score[a] + "\t");
		}

	}

}
