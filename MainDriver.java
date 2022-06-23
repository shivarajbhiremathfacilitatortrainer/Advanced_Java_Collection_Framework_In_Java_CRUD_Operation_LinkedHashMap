package com.advanced_java.collection_framework_in_java.maindriver_controller;

import com.advanced_java.collection_framework_in_java.linkedhashmap_crud_operation.LinkedHashMapCrudOperation;

public class MainDriver
{
	static LinkedHashMapCrudOperation linkedHashMapCrudOperation = new LinkedHashMapCrudOperation();
	public static void main(String[] args)
	{
		linkedHashMapCrudOperation.createTheData();
		
		linkedHashMapCrudOperation.readTheData();
		
		linkedHashMapCrudOperation.updateTheData();
		
		linkedHashMapCrudOperation.deleteTheData();
	}
}