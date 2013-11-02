package com.glaf.isdp.util;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class InputType {
	private final static ConcurrentMap<String, Integer> dataMap = new ConcurrentHashMap<String, Integer>();

	public static final int CELL_ORDER_TYPE = 1;

	public static final int CELL_ORDER_F_TYPE = 2;

	public static final int CELL_PLAN_TYPE = 3;

	public static final int CELL_PLAN2_TYPE = 4;

	public static final int CELL_RECSYSDATA_TYPE = 5;

	public static final int CELL_SETF_CLASS_TYPE = 6;

	public static final int CELL_SETF_NUM_TYPE = 7;

	public static final int CELL_SETF_TNAME_TYPE = 8;

	public static final int CELL_SETF_TYPE = 9;

	public static final int CELL_SETM_FLOWPIC_TYPE = 10;

	public static final int CELL_SETM_NAME_TYPE = 11;

	public static final int CELL_SETM_SYSBUSIESS_TYPE = 12;

	public static final int CELL_SETM_TASKS_TYPE = 13;

	public static final int CELL_SETM_TASKSFLOW_TYPE = 14;

	public static final int CELL_SETP_BTYPE_TYPE = 15;

	public static final int CELL_SETP_DATATYPE_TYPE = 16;

	public static final int CELL_SETP_FTYPE_TYPE = 17;

	public static final int CELL_SETP_NUM_TYPE = 18;

	public static final int CELL_SETP_PICTNAME_TYPE = 19;

	public static final int CELL_SETP_PICTYPE_TYPE = 20;

	public static final int CELL_SETP_TYPE = 31;

	public static final int CELL_SETR_CHART_TYPE = 32;

	public static final int CELL_SETR_FILLDATA_TYPE = 33;

	public static final int CELL_SETR_FOLDER_TYPE = 34;

	public static final int CELL_SETR_FORMNAME_TYPE = 35;

	public static final int CELL_SETR_FORMNUM_TYPE = 36;

	public static final int CELL_SETR_HINT_TYPE = 37;

	public static final int CELL_SETR_MERGETREE_TYPE = 38;

	public static final int CELL_SETR_MUSTFILL_TYPE = 39;

	public static final int CELL_SETR_SIGN_TYPE = 40;

	public static final int CELL_SETR_USERFOLDER_TYPE = 51;

	public static final int CELL_SETR_WORDBOOK_TYPE = 52;

	public static final int CELL_SYSWBNODES_TYPE = 53;

	public static final int CELL_SYSWBNODES_FILES_TYPE = 54;

	public static final int CELL_SYSWBSAUTOSTART_TYPE = 55;

	public static final int CELL_WBS_TYPE = 56;

	public static final int CELL_WBSUSENAME_TYPE = 57;

	public static final int DOT_TYPE = 58;

	public static final int F1_TYPE = 59;

	public static final int OPASSWORD_TYPE = 60;

	public static final int PLAN_WBS0_TYPE = 61;

	public static final int PLAN_WBS1_TYPE = 62;

	public static final int PLAN_WBSVALUES_TYPE = 63;

	public static final int PLANPROJ_TYPE = 64;

	public static final int PROJ_INSPECTION_TYPE = 65;

	public static final int PROJ_INSPECTION_IN_TYPE = 66;

	public static final int PROJ_INSPECTION_WBS_TYPE = 67;

	public static final int PROJ_MUIPROJ_TYPE = 68;

	public static final int PROJ_MUIPROJLOCA_TYPE = 69;

	public static final int PROJ_RECEMAIL_TYPE = 70;

	public static final int PROJ_SENDEMAIL_TYPE = 71;

	public static final int S_RECFILE_TYPE = 72;

	public static final int S_RECFILE_R_TYPE = 73;

	public static final int S_SENDFILE_TYPE = 74;

	public static final int S_SENDFILE_M_TYPE = 75;

	public static final int SYSBACKUP_TYPE = 76;

	public static final int SYSINIT_TYPE = 77;

	public static final int SYSPLANDESIGN_TYPE = 78;

	public static final int SYSRESET_TYPE = 79;

	public static final int SYSUSER_TYPE = 80;

	public static final int SYSUSERSIGN_TYPE = 81;

	static {

		dataMap.put("cell_order", CELL_ORDER_TYPE);
		dataMap.put("cell_order_f", CELL_ORDER_F_TYPE);
		dataMap.put("cell_plan", CELL_PLAN_TYPE);
		dataMap.put("cell_plan2", CELL_PLAN2_TYPE);
		dataMap.put("cell_recsysdata", CELL_RECSYSDATA_TYPE);
		dataMap.put("cell_setf_class", CELL_SETF_CLASS_TYPE);
		dataMap.put("cell_setf_num", CELL_SETF_NUM_TYPE);
		dataMap.put("cell_setf_tname", CELL_SETF_TNAME_TYPE);
		dataMap.put("cell_setf_type", CELL_SETF_TYPE);
		dataMap.put("cell_setm_flowpic", CELL_SETM_FLOWPIC_TYPE);

		dataMap.put("cell_setm_name", CELL_SETM_NAME_TYPE);
		dataMap.put("cell_setm_sysbusiess", CELL_SETM_SYSBUSIESS_TYPE);
		dataMap.put("cell_setm_tasks", CELL_SETM_TASKS_TYPE);
		dataMap.put("cell_setm_tasksflow", CELL_SETM_TASKSFLOW_TYPE);
		dataMap.put("cell_setp_btype", CELL_SETP_BTYPE_TYPE);
		dataMap.put("cell_setp_datatype", CELL_SETP_DATATYPE_TYPE);
		dataMap.put("cell_setp_ftype", CELL_SETP_FTYPE_TYPE);
		dataMap.put("cell_setp_num", CELL_SETP_NUM_TYPE);
		dataMap.put("cell_setp_pictname", CELL_SETP_PICTNAME_TYPE);
		dataMap.put("cell_setp_pictype", CELL_SETP_PICTYPE_TYPE);

		dataMap.put("cell_setp_type", CELL_SETP_TYPE);
		dataMap.put("cell_setr_chart", CELL_SETR_CHART_TYPE);
		dataMap.put("cell_setr_filldata", CELL_SETR_FILLDATA_TYPE);
		dataMap.put("cell_setr_folder", CELL_SETR_FOLDER_TYPE);
		dataMap.put("cell_setr_formname", CELL_SETR_FORMNAME_TYPE);
		dataMap.put("cell_setr_formnum", CELL_SETR_FORMNUM_TYPE);
		dataMap.put("cell_setr_hint", CELL_SETR_HINT_TYPE);
		dataMap.put("cell_setr_mergeTree", CELL_SETR_MERGETREE_TYPE);
		dataMap.put("cell_setr_mustfill", CELL_SETR_MUSTFILL_TYPE);
		dataMap.put("cell_setr_sign", CELL_SETR_SIGN_TYPE);

		dataMap.put("cell_setr_userfolder", CELL_SETR_USERFOLDER_TYPE);
		dataMap.put("cell_setr_wordbook", CELL_SETR_WORDBOOK_TYPE);
		dataMap.put("cell_syswbnodes", CELL_SYSWBNODES_TYPE);
		dataMap.put("cell_syswbnodes_files", CELL_SYSWBNODES_FILES_TYPE);
		dataMap.put("cell_syswbsautostart", CELL_SYSWBSAUTOSTART_TYPE);
		dataMap.put("cell_wbs", CELL_WBS_TYPE);
		dataMap.put("cell_wbsusename", CELL_WBSUSENAME_TYPE);
		dataMap.put("dot", DOT_TYPE);
		dataMap.put("f-1", F1_TYPE);
		dataMap.put("opassword", OPASSWORD_TYPE);

		dataMap.put("plan_wbs0", PLAN_WBS0_TYPE);
		dataMap.put("plan_wbs1", PLAN_WBS1_TYPE);
		dataMap.put("plan_wbsvalues", PLAN_WBSVALUES_TYPE);
		dataMap.put("planproj", PLANPROJ_TYPE);
		dataMap.put("proj_Inspection", PROJ_INSPECTION_TYPE);
		dataMap.put("proj_Inspection_in", PROJ_INSPECTION_IN_TYPE);
		dataMap.put("proj_Inspection_wbs", PROJ_INSPECTION_WBS_TYPE);
		dataMap.put("proj_MuiProj", PROJ_MUIPROJ_TYPE);
		dataMap.put("proj_MuiProjLoca", PROJ_MUIPROJLOCA_TYPE);
		dataMap.put("proj_recemail", PROJ_RECEMAIL_TYPE);

		dataMap.put("proj_sendemail", PROJ_SENDEMAIL_TYPE);
		dataMap.put("s_recfile", S_RECFILE_TYPE);
		dataMap.put("s_recfile_r", S_RECFILE_R_TYPE);
		dataMap.put("s_sendfile", S_SENDFILE_TYPE);
		dataMap.put("s_sendfile_m", S_SENDFILE_M_TYPE);
		dataMap.put("SysBackup", SYSBACKUP_TYPE);
		dataMap.put("SysInit", SYSINIT_TYPE);
		dataMap.put("sysplandesign", SYSPLANDESIGN_TYPE);
		dataMap.put("SysReset", SYSRESET_TYPE);
		dataMap.put("sysuser", SYSUSER_TYPE);
		dataMap.put("Sysusersign", SYSUSERSIGN_TYPE);
	}

	/**
	 * 根据类型名称获取数据类型
	 * 
	 * @param typeName
	 *            类型名称
	 * @return
	 */
	public static int getInputType(String typeName) {
		if (typeName == null) {
			return 0;
		}
		typeName = typeName.trim().toUpperCase();
		if (dataMap.containsKey(typeName)) {
			Integer value = dataMap.get(typeName);
			return value.intValue();
		}
		return 0;
	}

	/**
	 * 根据值返回类型名称
	 * 
	 * @param dataType
	 * 
	 * @return 类型名称
	 */
	public static String getType(int dataType) {
		Iterator<String> iterator = dataMap.keySet().iterator();
		while (iterator.hasNext()) {
			String typeName = iterator.next();
			Integer type = dataMap.get(typeName);
			if (type.intValue() == dataType) {
				return typeName;
			}
		}
		return null;
	}

	private InputType() {
	}
}