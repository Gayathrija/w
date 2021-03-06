// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package ktc_scs_schema.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class SetTC5051 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __mxObject;
	private ktc_scs_schema.proxies.TC5051Rq mxObject;

	public SetTC5051(IContext context, IMendixObject mxObject)
	{
		super(context);
		this.__mxObject = mxObject;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.mxObject = __mxObject == null ? null : ktc_scs_schema.proxies.TC5051Rq.initialize(getContext(), __mxObject);

		// BEGIN USER CODE
		StringBuffer sb = new StringBuffer();

		try {
			sb.append(MessageClass.setMessageNumber(this.mxObject.getAXKIPN(),19));
		}catch (Exception ex) {
			throw new com.mendix.systemwideinterfaces.MendixRuntimeException(ex.getMessage());
		}
		return sb.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC5051";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
