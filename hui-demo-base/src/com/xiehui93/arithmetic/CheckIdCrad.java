package com.xiehui93.arithmetic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @Title: CheckIdCrad.java 
 * @Package com.xiehui93.arithmetic 
 * @Description: TODO(判断身份证：要么是15位，要么是18位，最后一位可以为字母，并写程序提出其中的年月日) 
 * @author xiehui 
 * @email xiehui93@qq.com
 * @date 2019年8月14日 上午9:27:31 
 * @version V1.0 
 * 我们可以用正则表达式来定义复杂的字符串格式，(\d{17}[0-9a-zA-Z]|\d{14}[0-9a-zA-Z])可以用来判断是否为合法的15位或18位身份证号码。
因为15位和18位的身份证号码都是从7位到第12位为身份证为日期类型。这样我们可以设计出更精确的正则模式，使身份证号的日期合法，这样我们的正则模式可以进一步将日期部分的正则修改为[12][0-9]{3}[01][0-9][123][0-9]，当然可以更精确的设置日期。
在jdk的java.util.Regex包中有实现正则的类,Pattern和Matcher。
 *    
 */
public class CheckIdCrad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 测试是否为合法的身份证号码
		String[] strs = { "130681198712092019", "13068119871209201x",
				"13068119871209201", "123456789012345", "12345678901234x",
				"1234567890123" };
		Pattern p1 = Pattern.compile("(\\d{17}[0-9a-zA-Z]|\\d{14}[0-9a-zA-Z])");
		for (int i = 0; i < strs.length; i++) {
			Matcher matcher = p1.matcher(strs[i]);
			System.out.println(strs[i] + ":" + matcher.matches());
		}

		Pattern p2 = Pattern.compile("\\d{6}(\\d{8}).*"); // 用于提取出生日字符串
		Pattern p3 = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})");// 用于将生日字符串进行分解为年月日
		for (int i = 0; i < strs.length; i++) {
			Matcher matcher = p2.matcher(strs[i]);
			boolean b = matcher.find();
			if (b) {
				String s = matcher.group(1);
				Matcher matcher2 = p3.matcher(s);
				if (matcher2.find()) {
					System.out
							.println("生日为" + matcher2.group(1) + "年"
									+ matcher2.group(2) + "月"
									+ matcher2.group(3) + "日");
				}
			}

		}

	}


}
