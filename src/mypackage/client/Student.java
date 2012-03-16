package mypackage.client;

import com.google.gwt.core.client.JavaScriptObject;
class Student extends JavaScriptObject
{
	protected Student()
	{}
	public final native int getID()
	/*-{
       return this.students.id; 
	}-*/;
	public final native String getFirstName()
	/*-{
       return this.students.first_name; 
	}-*/;
	public final native String getLastName()
	/*-{
       return this.students.last_name; 
	}-*/;
	public final native String getMajor()
	/*-{
       return this.students.major; 
	}-*/;
}