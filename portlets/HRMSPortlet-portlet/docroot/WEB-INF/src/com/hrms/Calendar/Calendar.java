package com.hrms.Calendar;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.hrms.model.Todo;
import com.hrms.service.TodoLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;

@Controller
@RequestMapping("VIEW")
public class Calendar {
	@RenderMapping
	public String defaultRender(RenderRequest req, RenderResponse res)
	{
		return "view";
	}
	
	@ActionMapping(params="action=addTask")
	public void addTaskRender(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException
	{
		System.out.println("In action mapping");
		String date = ParamUtil.getString(actionRequest,"date");
		System.out.println(date);
		String task = ParamUtil.getString(actionRequest, "task");
		System.out.println(task);
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = themeDisplay.getUserId();
		Todo td=TodoLocalServiceUtil.createTodo(CounterLocalServiceUtil.increment());
		td.setUserId(userId);
		td.setDate(date);
		td.setTaskDetails(task);
		TodoLocalServiceUtil.addTodo(td);
	}
}



