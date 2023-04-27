package ex01toex04;

public class Ex01 {

	public boolean isPowerOf(int ip1, int ip2) {
			if(ip1==1||ip2==1) return true;
			if(ip1==ip2) return true;
			if(ip1>ip2) {
				int temp = ip1;
			    while (temp <= ip2) {
			        if (temp == ip2) {
			            return true;
			        }
			        temp *= ip1;
			    }
			    return false;
			}
			else {
				int temp2 = ip2;
			    while (temp2 <= ip1) {
			        if (temp2 == ip1) {
			            return true;
			        }
			        temp2 *= ip2;
			    }
			    return false;
			}
		
	}

}
