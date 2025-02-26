package springFw.ex03.di02;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {

	private List<Object> lists;
	private Set<Object> sets;
	private Map<String, Object> maps;
	private Properties props;
	
	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public Set<Object> getSets() {
		return sets;
	}
	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	//멤버필드들의 상태를 체크하기 위해 toString, Object 를 상속받기 때문에 @Override
	@Override
	public String toString() {
		return "Customer [lists=" + lists + ", sets=" + sets + ", maps=" + maps + ", props=" + props + "]";
	}
	
}
