package ly.array.test01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test01 {
	public static void main(String[] args) {
		String[] arr;
		String[] arr1[];
		String[] array=new String[5];
		String[] array1={"马超","马云","关羽","刘备","张飞"};
		int array2[]=new int[3];
		int[] arr2 = new int[]{1,2,3,4,5,6,7,8,9,0};
		//数组的遍历
		for (int i=0;i<arr2.length;i++ ) {
			System.out.println(arr2[i]);
		}
		//将数组转字符串形式打印
		System.out.println(Arrays.toString(arr2));
		//将array数组转成List
		//1.
		ArrayList<String> aList = new ArrayList<>(Arrays.asList(array1));
		System.out.println(aList);
		//2.
		List<String> aList2 = new ArrayList<>();
		for(int i = 0;i<array1.length;i++){
			aList2.add(array1[i]);
		}
		//
		String name="马超";
		
		if (aList.contains(name)) {
			System.out.println("is good");
		}
		
		
		int[] arr11 = {1,2,3,4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3};
		//利用set的特性无序且不重复
		Set<Integer> set2 = new HashSet<>();
		for(int i=0;i<arr11.length;i++){
			set2.add(arr11[i]);
		}
		System.out.println(set2);//[0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		//转回数组
		int[] arr12 = new int[set2.size()];
		int j=0;
		for (int i : set2) {
			arr12[j++]=i;
		}
		Arrays.sort(arr12);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 32]
		System.out.println(Arrays.toString(arr12));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
