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

public class SetTC2214 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __TC2214;
	private ktc_scs_schema.proxies.TC2214_INPART03DS TC2214;

	public SetTC2214(IContext context, IMendixObject TC2214)
	{
		super(context);
		this.__TC2214 = TC2214;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.TC2214 = __TC2214 == null ? null : ktc_scs_schema.proxies.TC2214_INPART03DS.initialize(getContext(), __TC2214);

		// BEGIN USER CODE
		String strMessageApplication = "";
		
		try
		{
			strMessageApplication = MessageClass.setMessageNumber(this.TC2214.getIPKIPN(), 19)
					+ MessageClass.setMessageString(this.TC2214.getIPLSNM(), 40)
					+ MessageClass.setMessageNumber(this.TC2214.getIPCIFN(), 19)
					+ MessageClass.setMessageString(this.TC2214.getIPOLIC(), 40)
					+ MessageClass.setMessageString(this.TC2214.getIPITP1(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPCIDT(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPTITL(), 6)
					+ MessageClass.setMessageString(this.TC2214.getIPNAME(), 40)
					+ MessageClass.setMessageString(this.TC2214.getIPINIT(), 40)
					+ MessageClass.setMessageString(this.TC2214.getIPEMNM(), 26)
					+ MessageClass.setMessageString(this.TC2214.getIPEMN1(), 26)
					+ MessageClass.setMessageString(this.TC2214.getIPNWIC(), 40)
					+ MessageClass.setMessageString(this.TC2214.getIPITP2(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPMONM(), 40)
					+ MessageClass.setMessageNumber(this.TC2214.getIPMBRS(), 6)
					+ MessageClass.setMessageNumber(this.TC2214.getIPSEX(), 1)
					+ MessageClass.setMessageString(this.TC2214.getIPNATI(), 3)
					+ MessageClass.setMessageNumber(this.TC2214.getIPPENO(), 11)
					+ MessageClass.setMessageNumber(this.TC2214.getIPFDAT(), 8)
					+ MessageClass.setMessageString(this.TC2214.getIPFORT(), 25)
					+ MessageClass.setMessageString(this.TC2214.getIPINCD(), 1)
					+ MessageClass.setMessageString(this.TC2214.getIPRELG(), 6)
					+ MessageClass.setMessageString(this.TC2214.getIPCTCD(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPLCDE(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPCIVS(), 3)
					+ MessageClass.setMessageNumber(this.TC2214.getIPBERO(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPAKRT(), 1)
					+ MessageClass.setMessageString(this.TC2214.getIPRISC(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPHEDU(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPRACE(), 6)
					+ MessageClass.setMessageString(this.TC2214.getIPPRVH(), 1)
					+ MessageClass.setMessageNumber(this.TC2214.getIPITYP(), 1)
					+ MessageClass.setMessageString(this.TC2214.getIPFRNM(), 20)
					+ MessageClass.setMessageString(this.TC2214.getIPNAM2(), 40)
					+ MessageClass.setMessageString(this.TC2214.getIPHUS(), 3)
					+ MessageClass.setMessageNumber(this.TC2214.getIPFLDT(), 6)
					+ MessageClass.setMessageString(this.TC2214.getIPADRF(), 1)
					+ MessageClass.setMessageNumber(this.TC2214.getIPSEQ1(), 4)
					+ MessageClass.setMessageString(this.TC2214.getIPADR1(), 40)
					+ MessageClass.setMessageString(this.TC2214.getIPADR2(), 40)
					+ MessageClass.setMessageString(this.TC2214.getIPADR3(), 40)
					+ MessageClass.setMessageString(this.TC2214.getIPADR4(), 40)
					+ MessageClass.setMessageString(this.TC2214.getIPPNR(), 9)
					+ MessageClass.setMessageString(this.TC2214.getIPCITY(), 40)
					+ MessageClass.setMessageString(this.TC2214.getIPLSTE(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPCNCD(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPTELH(), 20)
					+ MessageClass.setMessageString(this.TC2214.getIPTELA(), 20)
					+ MessageClass.setMessageString(this.TC2214.getIPFAX1(), 20)
					+ MessageClass.setMessageString(this.TC2214.getIPEMLP(), 100)
					+ MessageClass.setMessageString(this.TC2214.getIPEML1(), 100)
					+ MessageClass.setMessageString(this.TC2214.getIPCBIL(), 1)
					+ MessageClass.setMessageNumber(this.TC2214.getIPMMTL(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPBRCD(), 1)
					+ MessageClass.setMessageNumber(this.TC2214.getIPCONO(), 3)
					+ MessageClass.setMessageNumber(this.TC2214.getIPCODT(), 8)
					+ MessageClass.setMessageNumber(this.TC2214.getIPOLAC(), 19)
					+ MessageClass.setMessageNumber(this.TC2214.getIPBGNO(), 19)
					+ MessageClass.setMessageString(this.TC2214.getIPBANM(), 40)
					+ MessageClass.setMessageNumber(this.TC2214.getIPKNTL(), 5)
					+ MessageClass.setMessageString(this.TC2214.getIPUSC1(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPUSC2(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPUSC3(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPUSC4(), 3)
					+ MessageClass.setMessageString(this.TC2214.getIPLIAB(), 1)
					+ MessageClass.setMessageString(this.TC2214.getIPCTNM(), 40)
					+ MessageClass.setMessageString(this.TC2214.getIPRCTP(), 1)
					+ MessageClass.setMessageString(this.TC2214.getIPREST(), 1)
					+ MessageClass.setMessageString(this.TC2214.getIPDCSD(), 1)
					+ MessageClass.setMessageNumber(this.TC2214.getIPBOD6(), 19)
					+ MessageClass.setMessageNumber(this.TC2214.getIPDTTM(), 14)
					+ MessageClass.setMessageString(this.TC2214.getIPTEL3(), 20)
					+ MessageClass.setMessageString(this.TC2214.getIPLBIL(), 1)
					+ MessageClass.setMessageNumber(this.TC2214.getIPEXDT(), 8)
					+ MessageClass.setMessageNumber(this.TC2214.getIPBVDT(), 8)
					+ MessageClass.setMessageString(this.TC2214.getIPPSTS(), 1)
					+ MessageClass.setMessageString(this.TC2214.getIPCLAS(), 1)
					+ MessageClass.setMessageString(this.TC2214.getIPGSTI(), 1)
					+ MessageClass.setMessageNumber(this.TC2214.getIPBR(), 5)
					+ MessageClass.setMessageString(this.TC2214.getIPLSNC(), 40)
					+ MessageClass.setMessageNumber(this.TC2214.getIPTELHE(), 7)
					+ MessageClass.setMessageNumber(this.TC2214.getIPTELAE(), 7)
					+ MessageClass.setMessageString(this.TC2214.getIPSPHI(), 4)
					+ MessageClass.setMessageNumber(this.TC2214.getIPSPED(), 8)
					+ MessageClass.setMessageNumber(this.TC2214.getIPSPCD(), 8)
					+ MessageClass.setMessageString(this.TC2214.getIPSPCB(), 10)
					+ MessageClass.setMessageString(this.TC2214.getIPSPPI(), 4)
					+ MessageClass.setMessageString(this.TC2214.getIPSPHR(), 100)
					+ MessageClass.setMessageString(this.TC2214.getIPSPRF(), 1);
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
		return "SetTC2214";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
