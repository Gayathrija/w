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

public class SetTC3214 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __TC3214;
	private ktc_scs_schema.proxies.TC3214_INPART03DS TC3214;

	public SetTC3214(IContext context, IMendixObject TC3214)
	{
		super(context);
		this.__TC3214 = TC3214;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.TC3214 = __TC3214 == null ? null : ktc_scs_schema.proxies.TC3214_INPART03DS.initialize(getContext(), __TC3214);

		// BEGIN USER CODE
		String strMessageApplication = "";
		
		try
		{
			strMessageApplication = MessageClass.setMessageNumber(this.TC3214.getIPKIPN(), 19)
					+ MessageClass.setMessageString(this.TC3214.getIPLSNM(), 40)
					+ MessageClass.setMessageNumber(this.TC3214.getIPCIFN(), 19)
					+ MessageClass.setMessageString(this.TC3214.getIPOLIC(), 40)
					+ MessageClass.setMessageString(this.TC3214.getIPITP1(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPCIDT(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPTITL(), 6)
					+ MessageClass.setMessageString(this.TC3214.getIPNAME(), 40)
					+ MessageClass.setMessageString(this.TC3214.getIPINIT(), 40)
					+ MessageClass.setMessageString(this.TC3214.getIPEMNM(), 26)
					+ MessageClass.setMessageString(this.TC3214.getIPEMN1(), 26)
					+ MessageClass.setMessageString(this.TC3214.getIPNWIC(), 40)
					+ MessageClass.setMessageString(this.TC3214.getIPITP2(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPMONM(), 40)
					+ MessageClass.setMessageNumber(this.TC3214.getIPMBRS(), 6)
					+ MessageClass.setMessageNumber(this.TC3214.getIPSEX(), 1)
					+ MessageClass.setMessageString(this.TC3214.getIPNATI(), 3)
					+ MessageClass.setMessageNumber(this.TC3214.getIPPENO(), 11)
					+ MessageClass.setMessageNumber(this.TC3214.getIPFDAT(), 8)
					+ MessageClass.setMessageString(this.TC3214.getIPFORT(), 25)
					+ MessageClass.setMessageString(this.TC3214.getIPINCD(), 1)
					+ MessageClass.setMessageString(this.TC3214.getIPRELG(), 6)
					+ MessageClass.setMessageString(this.TC3214.getIPCTCD(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPLCDE(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPCIVS(), 3)
					+ MessageClass.setMessageNumber(this.TC3214.getIPBERO(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPAKRT(), 1)
					+ MessageClass.setMessageString(this.TC3214.getIPRISC(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPHEDU(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPRACE(), 6)
					+ MessageClass.setMessageString(this.TC3214.getIPPRVH(), 1)
					+ MessageClass.setMessageNumber(this.TC3214.getIPITYP(), 1)
					+ MessageClass.setMessageString(this.TC3214.getIPFRNM(), 20)
					+ MessageClass.setMessageString(this.TC3214.getIPNAM2(), 40)
					+ MessageClass.setMessageString(this.TC3214.getIPHUS(), 3)
					+ MessageClass.setMessageNumber(this.TC3214.getIPFLDT(), 6)
					+ MessageClass.setMessageString(this.TC3214.getIPADRF(), 1)
					+ MessageClass.setMessageNumber(this.TC3214.getIPSEQ1(), 4)
					+ MessageClass.setMessageString(this.TC3214.getIPADR1(), 40)
					+ MessageClass.setMessageString(this.TC3214.getIPADR2(), 40)
					+ MessageClass.setMessageString(this.TC3214.getIPADR3(), 40)
					+ MessageClass.setMessageString(this.TC3214.getIPADR4(), 40)
					+ MessageClass.setMessageString(this.TC3214.getIPPNR(), 9)
					+ MessageClass.setMessageString(this.TC3214.getIPCITY(), 40)
					+ MessageClass.setMessageString(this.TC3214.getIPLSTE(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPCNCD(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPTELH(), 20)
					+ MessageClass.setMessageString(this.TC3214.getIPTELA(), 20)
					+ MessageClass.setMessageString(this.TC3214.getIPFAX1(), 20)
					+ MessageClass.setMessageString(this.TC3214.getIPEMLP(), 100)
					+ MessageClass.setMessageString(this.TC3214.getIPEML1(), 100)
					+ MessageClass.setMessageString(this.TC3214.getIPCBIL(), 1)
					+ MessageClass.setMessageNumber(this.TC3214.getIPMMTL(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPBRCD(), 1)
					+ MessageClass.setMessageNumber(this.TC3214.getIPCONO(), 3)
					+ MessageClass.setMessageNumber(this.TC3214.getIPCODT(), 8)
					+ MessageClass.setMessageNumber(this.TC3214.getIPOLAC(), 19)
					+ MessageClass.setMessageNumber(this.TC3214.getIPBGNO(), 19)
					+ MessageClass.setMessageString(this.TC3214.getIPBANM(), 40)
					+ MessageClass.setMessageNumber(this.TC3214.getIPKNTL(), 5)
					+ MessageClass.setMessageString(this.TC3214.getIPUSC1(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPUSC2(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPUSC3(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPUSC4(), 3)
					+ MessageClass.setMessageString(this.TC3214.getIPLIAB(), 1)
					+ MessageClass.setMessageString(this.TC3214.getIPCTNM(), 40)
					+ MessageClass.setMessageString(this.TC3214.getIPRCTP(), 1)
					+ MessageClass.setMessageString(this.TC3214.getIPREST(), 1)
					+ MessageClass.setMessageString(this.TC3214.getIPDCSD(), 1)
					+ MessageClass.setMessageNumber(this.TC3214.getIPBOD6(), 19)
					+ MessageClass.setMessageNumber(this.TC3214.getIPDTTM(), 14)
					+ MessageClass.setMessageString(this.TC3214.getIPTEL3(), 20)
					+ MessageClass.setMessageString(this.TC3214.getIPLBIL(), 1)
					+ MessageClass.setMessageNumber(this.TC3214.getIPEXDT(), 8)
					+ MessageClass.setMessageNumber(this.TC3214.getIPBVDT(), 8)
					+ MessageClass.setMessageString(this.TC3214.getIPPSTS(), 1)
					+ MessageClass.setMessageString(this.TC3214.getIPCLAS(), 1)
					+ MessageClass.setMessageString(this.TC3214.getIPGSTI(), 1)
					+ MessageClass.setMessageNumber(this.TC3214.getIPBR(), 5)
					+ MessageClass.setMessageString(this.TC3214.getIPLSNC(), 40)
					+ MessageClass.setMessageNumber(this.TC3214.getIPTELHE(), 7)
					+ MessageClass.setMessageNumber(this.TC3214.getIPTELAE(), 7)
					+ MessageClass.setMessageString(this.TC3214.getIPSPHI(), 4)
					+ MessageClass.setMessageNumber(this.TC3214.getIPSPED(), 8)
					+ MessageClass.setMessageNumber(this.TC3214.getIPSPCD(), 8)
					+ MessageClass.setMessageString(this.TC3214.getIPSPCB(), 10)
					+ MessageClass.setMessageString(this.TC3214.getIPSPPI(), 4)
					+ MessageClass.setMessageString(this.TC3214.getIPSPHR(), 100)
					+ MessageClass.setMessageString(this.TC3214.getIPSPRF(), 1);
		}
		catch (Exception ex)
		{
			throw new com.mendix.systemwideinterfaces.MendixRuntimeException(ex.getMessage());
		}
		
		return strMessageApplication;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC3214";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
