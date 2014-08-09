package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.*;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.base.modules.sys.model.CellTreedot;
import com.glaf.core.base.JSONable;

public class RolePrivilege implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	protected CellMenu cellMenu;

	protected Collection<MyCellBusiess> mycellBusiesses;

	protected Collection<CellTreedot> cellTreedots;

	protected Collection<NetRoleUse> netRoleUses;

	protected Collection<RoleUse2> roleUse2s;

	protected Collection<RoleUse> roleUses;

	public RolePrivilege() {

	}

	public CellMenu getCellMenu() {
		return cellMenu;
	}

	public Collection<CellTreedot> getCellTreedots() {
		return cellTreedots;
	}

	public Collection<MyCellBusiess> getMycellBusiesses() {
		return mycellBusiesses;
	}

	public Collection<NetRoleUse> getNetRoleUses() {
		return netRoleUses;
	}

	public Collection<RoleUse2> getRoleUse2s() {
		return roleUse2s;
	}

	public Collection<RoleUse> getRoleUses() {
		return roleUses;
	}

	public void setCellMenu(CellMenu cellMenu) {
		this.cellMenu = cellMenu;
	}

	public void setCellTreedots(Collection<CellTreedot> cellTreedots) {
		this.cellTreedots = cellTreedots;
	}

	public void setMycellBusiesses(Collection<MyCellBusiess> mycellBusiesses) {
		this.mycellBusiesses = mycellBusiesses;
	}

	public void setNetRoleUses(Collection<NetRoleUse> netRoleUses) {
		this.netRoleUses = netRoleUses;
	}

	public void setRoleUse2s(Collection<RoleUse2> roleUse2s) {
		this.roleUse2s = roleUse2s;
	}

	public void setRoleUses(Collection<RoleUse> roleUses) {
		this.roleUses = roleUses;
	}

	public JSONObject toJsonObject() {
		JSONObject json = new JSONObject();
		if (cellMenu != null) {
			json.put("cellMenu", cellMenu.toJsonObject());
		}
		if (mycellBusiesses != null) {
			JSONArray array = new JSONArray();
			for (MyCellBusiess m : mycellBusiesses) {
				array.add(m.toJsonObject());
			}
			json.put("mycellBusiesses", array);
		}

		if (cellTreedots != null) {
			JSONArray array = new JSONArray();
			for (CellTreedot m : cellTreedots) {
				array.add(m.toJsonObject());
			}
			json.put("cellTreedots", array);
		}

		if (netRoleUses != null) {
			JSONArray array = new JSONArray();
			for (NetRoleUse m : netRoleUses) {
				array.add(m.toJsonObject());
			}
			json.put("netRoleUses", array);
		}

		if (roleUse2s != null) {
			JSONArray array = new JSONArray();
			for (RoleUse2 m : roleUse2s) {
				array.add(m.toJsonObject());
			}
			json.put("roleUse2s", array);
		}

		if (roleUses != null) {
			JSONArray array = new JSONArray();
			for (RoleUse m : roleUses) {
				array.add(m.toJsonObject());
			}
			json.put("roleUses", array);
		}

		return json;
	}

	public ObjectNode toObjectNode() {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		if (cellMenu != null) {
			jsonObject.set("cellMenu", cellMenu.toObjectNode());
		}

		if (mycellBusiesses != null) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			for (MyCellBusiess m : mycellBusiesses) {
				array.add(m.toObjectNode());
			}
			jsonObject.set("mycellBusiesses", array);
		}

		if (cellTreedots != null) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			for (CellTreedot m : cellTreedots) {
				array.add(m.toObjectNode());
			}
			jsonObject.set("cellTreedots", array);
		}

		if (netRoleUses != null) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			for (NetRoleUse m : netRoleUses) {
				array.add(m.toObjectNode());
			}
			jsonObject.set("netRoleUses", array);
		}

		if (roleUse2s != null) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			for (RoleUse2 m : roleUse2s) {
				array.add(m.toObjectNode());
			}
			jsonObject.set("roleUse2s", array);
		}

		if (roleUses != null) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			for (RoleUse m : roleUses) {
				array.add(m.toObjectNode());
			}
			jsonObject.set("roleUses", array);
		}

		return jsonObject;
	}

	public RolePrivilege jsonToObject(JSONObject jsonObject) {
		return null;
	}

}
