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

public class SetTC1223 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __TC1223;
	private ktc_scs_schema.proxies.TC1223_DEKORT01DS TC1223;

	public SetTC1223(IContext context, IMendixObject TC1223)
	{
		super(context);
		this.__TC1223 = TC1223;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.TC1223 = __TC1223 == null ? null : ktc_scs_schema.proxies.TC1223_DEKORT01DS.initialize(getContext(), __TC1223);

		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC1223";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
