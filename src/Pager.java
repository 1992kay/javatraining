import java.util.List;

public class Pager<T> {

	//请求的第几页
	private Integer pageNum;
	//固定的每页显示数量
	private Integer itemNum;
	//存储返回的分页数据
	private List<T> datas;
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getItemNum() {
		return itemNum;
	}
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	public Pager() {
		//设置每页显示3条数据
		this.itemNum = 3;
	}
	
	
}
