package com.xiehui93.arithmetic;
/**
 * @Title: BinarySearch.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(�۰����) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019��8��14�� ����9:43:01 
 * @version V1.0   
 * 
 *  �۰���ң�Ҳ�ƶ��ֲ��ҡ�������������һ�������������в���ĳһ�ض�Ԫ�ص������㷨�����ع��̴�������м�Ԫ�ؿ�ʼ������м�Ԫ��������Ҫ���ҵ�Ԫ�أ������ع��̽��������ĳһ�ض�Ԫ�ش��ڻ���С���м�Ԫ�أ�����������ڻ�С���м�Ԫ�ص���һ���в��ң����Ҹ���ʼһ�����м�Ԫ�ؿ�ʼ�Ƚϡ������ĳһ���������Ѿ�Ϊ�գ����ʾ�Ҳ���ָ����Ԫ�ء����������㷨ÿһ�αȽ϶�ʹ������Χ��Сһ�룬��ʱ�临�Ӷ���O(logN)��
   ������ȱ��
       ���ֲ����㷨���ŵ��ǱȽϴ����٣������ٶȿ죬ƽ�����ܺ�;��ȱ����Ҫ������Ϊ������Ҳ���ɾ�����ѡ���ˣ����ֲ����㷨�����ڲ������䶯������Ƶ���������б�

 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] src = new int[] {1, 3, 5, 7, 8, 9};  
		 System.out.println(binarySearch(src, 3));
	}
	//����ʵ��
	private static int binarySearch(int[] arr , int target) {
		int bot = 1;
		int top = arr.length;
		while(bot <= top) {
			//��ֹ���
			int mid = (bot + top)>>>1;
			if(target > arr[mid]) {
				bot = mid + 1;
			}else if(target < arr[mid]) {
				top = mid -1;
			}else {
				return mid;
			} 
		}
		return -1;
	}
	//�ݹ�ʵ��
	private static int binarySearch(int[] arr ,int fromIndex ,int toIndex ,int target) {
		while(fromIndex <= toIndex) {
			//��ֹ���
			int mid = (fromIndex + toIndex)>>>1;
			if(arr[mid] < target){
				return binarySearch(arr, mid + 1, toIndex, target);
			}else if(arr[mid] > target){
				return binarySearch(arr,fromIndex , mid - 1, target);
			}else {
				return mid;
			}
			
		}
		return -1;
	}
}
