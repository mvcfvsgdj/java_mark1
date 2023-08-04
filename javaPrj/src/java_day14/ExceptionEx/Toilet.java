package java_day14.ExceptionEx;

public class Toilet {
    public String gender(String a) throws MensTolietException {
        if ("여자".equals(a)) {
            throw new MensTolietException();
        } else if ("남자".equals(a)) {
           System.out.println("들어가시오");
        } else {
        	System.out.println("당신은 화장실을 들어올 준비가 안됐다");
        }
        return a;
    }
}