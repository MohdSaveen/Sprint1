package com.example.sprint1;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseDTO implements Serializable {

	@SerializedName("coming_soon")
	private List<ComingSoonDTO> comingSoon;

	@SerializedName("now_showing")
	private List<NowShowingDTO> nowShowing;

	public List<ComingSoonDTO> getComingSoon(){
		return comingSoon;
	}

	public List<NowShowingDTO> getNowShowing(){
		return nowShowing;
	}
}