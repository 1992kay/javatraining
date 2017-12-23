import java.util.ArrayList;
import java.util.List;

public class StartGanJi {

	public static void main(String[] args) {
		dataStore ds = new dataStore();
		/*dataStore ds1 = new dataStore();
		dataStore ds2 = new dataStore();*/
		Pager<bycleModel> pb = browseByclePage(2);
		System.out.println(pb.getDatas());
	}
	
	public static Pager browseByclePage(Integer pageNum){
		Pager<bycleModel> byclePager = new Pager<>();
		List<bycleModel> bycleResult = new ArrayList<>();
		
		//每页显示三条数据
		int count = 1;
		for(int i = (pageNum -1)*3 ; count <= byclePager.getItemNum(); i++){
			//得到相应的元素
			bycleModel bModel = dataStore.bycleList.get(i);
			//传递给中间结果集
			bycleResult.add(bModel);
			count ++;
		}
		
		byclePager.setDatas(bycleResult);
		return byclePager;
	}

}
