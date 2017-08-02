package com.cienet.proxy;

import java.util.List;

import com.cienet.dlo.Dlo;
import com.cienet.ebo.Ebo;

public class Proxy {

	private Dlo dlo = new Dlo();
	
	public List<Ebo> search(String name){
		return dlo.search(name);
	}
}
