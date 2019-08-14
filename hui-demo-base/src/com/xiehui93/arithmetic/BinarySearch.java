package com.xiehui93.arithmetic;
/**
 * @Title: BinarySearch.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(折半查找) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月14日 上午9:43:01 
 * @version V1.0   
 * 
 *  折半查找，也称二分查找、二分搜索，是一种在有序数组中查找某一特定元素的搜索算法。搜素过程从数组的中间元素开始，如果中间元素正好是要查找的元素，则搜素过程结束；如果某一特定元素大于或者小于中间元素，则在数组大于或小于中间元素的那一半中查找，而且跟开始一样从中间元素开始比较。如果在某一步骤数组已经为空，则表示找不到指定的元素。这种搜索算法每一次比较都使搜索范围缩小一半，其时间复杂度是O(logN)。
   三、优缺点
       二分查找算法的优点是比较次数少，查找速度快，平均性能好;其缺点是要求待查表为有序表，且插入删除困难。因此，二分查找算法适用于不经常变动而查找频繁的有序列表。

 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] src = new int[] {1, 3, 5, 7, 8, 9};  
		 System.out.println(binarySearch(src, 3));
	}
	//迭代实现
	private static int binarySearch(int[] arr , int target) {
		int bot = 1;
		int top = arr.length;
		while(bot <= top) {
			//防止溢出
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
	//递归实现
	private static int binarySearch(int[] arr ,int fromIndex ,int toIndex ,int target) {
		while(fromIndex <= toIndex) {
			//防止溢出
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
