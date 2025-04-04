import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GitClass {

	public static void main(String[] args) {
		String arr1[]={"Pallavi","Singh","parihar"};

		System.out.println("Printing Array: " + Arrays.toString(arr1));
		List<String> list=new ArrayList<>();
		for(String lang:arr1){
		list.add(lang);
		}
		System.out.println("Printing List: "+list);

	}

	}


