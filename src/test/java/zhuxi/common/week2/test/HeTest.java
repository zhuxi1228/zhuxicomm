package zhuxi.common.week2.test;

import com.bobo.common.utils.StringUtil;
/**
 * 
 * @ClassName: HeTest 
 * @Description: TODO
 * @author:zx
 * @date: 2019年9月9日 上午9:06:38
 */
public class HeTest {
	//测试isPhone方法
	private void isPhone() {
		String str="18545697421";
		boolean b= StringUtil.isPhoneNumber(str);
		System.out.println(b);
	}
	//测试isEmail方法
	public void isEmail() {
		String str="17245894587@qq.com";
		boolean a = StringUtil.isEmail();
		System.out.println(a);
	}
}
