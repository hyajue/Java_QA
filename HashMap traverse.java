	Map<String, Integer> map = new HashMap<String, Integer>();

	//@Method1 ：For-Each 迭代entries
	for(Map.Entry<String, Integer> entry : map.entrySet()) {
		String key = entry.getKey();
		int value = entry.getValue();
	}


	//@Method2：For-Each 迭代keys和values，比method1稍微快一点
	for(String key : map.keySet())
		System.out.println("Key = " + key);
	for(Integer value : map.values())
		System.out.println("Value = " + value);


	//@Method3: Iterator迭代
	Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
	while(entries.hasNext()) {
		Map.Entry<String, Integer> entry = entries.next();
		System.out.println("Key = " + entry.getKey() + ", Value =" + entry.getValue());
	}