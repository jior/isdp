package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellUseDataInfoQuery extends DataQuery {
        private static final long serialVersionUID = 1L;
  	protected String tablename;
  	protected String tablenameLike;
  	protected List<String> tablenames;
  	protected String tableId;
  	protected String tableIdLike;
  	protected List<String> tableIds;
  	protected Integer ostTablename;
  	protected Integer ostTablenameGreaterThanOrEqual;
  	protected Integer ostTablenameLessThanOrEqual;
  	protected List<Integer> ostTablenames;
  	protected Integer ostRow;
  	protected Integer ostRowGreaterThanOrEqual;
  	protected Integer ostRowLessThanOrEqual;
  	protected List<Integer> ostRows;
  	protected Integer ostCol;
  	protected Integer ostColGreaterThanOrEqual;
  	protected Integer ostColLessThanOrEqual;
  	protected List<Integer> ostCols;
  	protected Integer flag;
  	protected Integer flagGreaterThanOrEqual;
  	protected Integer flagLessThanOrEqual;
  	protected List<Integer> flags;
  	protected Integer level;
  	protected Integer levelGreaterThanOrEqual;
  	protected Integer levelLessThanOrEqual;
  	protected List<Integer> levels;
  	protected String useTablename;
  	protected String useTablenameLike;
  	protected List<String> useTablenames;
  	protected String useId;
  	protected String useIdLike;
  	protected List<String> useIds;
  	protected Integer useIndexId;
  	protected Integer useIndexIdGreaterThanOrEqual;
  	protected Integer useIndexIdLessThanOrEqual;
  	protected List<Integer> useIndexIds;
	

    public CellUseDataInfoQuery() {

    }


    public String getTablename(){
        return tablename;
    }

    public String getTablenameLike(){
	    if (tablenameLike != null && tablenameLike.trim().length() > 0) {
		if (!tablenameLike.startsWith("%")) {
		    tablenameLike = "%" + tablenameLike;
		}
		if (!tablenameLike.endsWith("%")) {
		   tablenameLike = tablenameLike + "%";
		}
	    }
	return tablenameLike;
    }

    public List<String> getTablenames(){
	return tablenames;
    }


    public String getTableId(){
        return tableId;
    }

    public String getTableIdLike(){
	    if (tableIdLike != null && tableIdLike.trim().length() > 0) {
		if (!tableIdLike.startsWith("%")) {
		    tableIdLike = "%" + tableIdLike;
		}
		if (!tableIdLike.endsWith("%")) {
		   tableIdLike = tableIdLike + "%";
		}
	    }
	return tableIdLike;
    }

    public List<String> getTableIds(){
	return tableIds;
    }


    public Integer getOstTablename(){
        return ostTablename;
    }

    public Integer getOstTablenameGreaterThanOrEqual(){
        return ostTablenameGreaterThanOrEqual;
    }

    public Integer getOstTablenameLessThanOrEqual(){
	return ostTablenameLessThanOrEqual;
    }

    public List<Integer> getOstTablenames(){
	return ostTablenames;
    }


    public Integer getOstRow(){
        return ostRow;
    }

    public Integer getOstRowGreaterThanOrEqual(){
        return ostRowGreaterThanOrEqual;
    }

    public Integer getOstRowLessThanOrEqual(){
	return ostRowLessThanOrEqual;
    }

    public List<Integer> getOstRows(){
	return ostRows;
    }


    public Integer getOstCol(){
        return ostCol;
    }

    public Integer getOstColGreaterThanOrEqual(){
        return ostColGreaterThanOrEqual;
    }

    public Integer getOstColLessThanOrEqual(){
	return ostColLessThanOrEqual;
    }

    public List<Integer> getOstCols(){
	return ostCols;
    }


    public Integer getFlag(){
        return flag;
    }

    public Integer getFlagGreaterThanOrEqual(){
        return flagGreaterThanOrEqual;
    }

    public Integer getFlagLessThanOrEqual(){
	return flagLessThanOrEqual;
    }

    public List<Integer> getFlags(){
	return flags;
    }


    public Integer getLevel(){
        return level;
    }

    public Integer getLevelGreaterThanOrEqual(){
        return levelGreaterThanOrEqual;
    }

    public Integer getLevelLessThanOrEqual(){
	return levelLessThanOrEqual;
    }

    public List<Integer> getLevels(){
	return levels;
    }


    public String getUseTablename(){
        return useTablename;
    }

    public String getUseTablenameLike(){
	    if (useTablenameLike != null && useTablenameLike.trim().length() > 0) {
		if (!useTablenameLike.startsWith("%")) {
		    useTablenameLike = "%" + useTablenameLike;
		}
		if (!useTablenameLike.endsWith("%")) {
		   useTablenameLike = useTablenameLike + "%";
		}
	    }
	return useTablenameLike;
    }

    public List<String> getUseTablenames(){
	return useTablenames;
    }


    public String getUseId(){
        return useId;
    }

    public String getUseIdLike(){
	    if (useIdLike != null && useIdLike.trim().length() > 0) {
		if (!useIdLike.startsWith("%")) {
		    useIdLike = "%" + useIdLike;
		}
		if (!useIdLike.endsWith("%")) {
		   useIdLike = useIdLike + "%";
		}
	    }
	return useIdLike;
    }

    public List<String> getUseIds(){
	return useIds;
    }


    public Integer getUseIndexId(){
        return useIndexId;
    }

    public Integer getUseIndexIdGreaterThanOrEqual(){
        return useIndexIdGreaterThanOrEqual;
    }

    public Integer getUseIndexIdLessThanOrEqual(){
	return useIndexIdLessThanOrEqual;
    }

    public List<Integer> getUseIndexIds(){
	return useIndexIds;
    }



    public void setTablename(String tablename){
        this.tablename = tablename;
    }

    public void setTablenameLike( String tablenameLike){
	this.tablenameLike = tablenameLike;
    }

    public void setTablenames(List<String> tablenames){
        this.tablenames = tablenames;
    }


    public void setTableId(String tableId){
        this.tableId = tableId;
    }

    public void setTableIdLike( String tableIdLike){
	this.tableIdLike = tableIdLike;
    }

    public void setTableIds(List<String> tableIds){
        this.tableIds = tableIds;
    }


    public void setOstTablename(Integer ostTablename){
        this.ostTablename = ostTablename;
    }

    public void setOstTablenameGreaterThanOrEqual(Integer ostTablenameGreaterThanOrEqual){
        this.ostTablenameGreaterThanOrEqual = ostTablenameGreaterThanOrEqual;
    }

    public void setOstTablenameLessThanOrEqual(Integer ostTablenameLessThanOrEqual){
	this.ostTablenameLessThanOrEqual = ostTablenameLessThanOrEqual;
    }

    public void setOstTablenames(List<Integer> ostTablenames){
        this.ostTablenames = ostTablenames;
    }


    public void setOstRow(Integer ostRow){
        this.ostRow = ostRow;
    }

    public void setOstRowGreaterThanOrEqual(Integer ostRowGreaterThanOrEqual){
        this.ostRowGreaterThanOrEqual = ostRowGreaterThanOrEqual;
    }

    public void setOstRowLessThanOrEqual(Integer ostRowLessThanOrEqual){
	this.ostRowLessThanOrEqual = ostRowLessThanOrEqual;
    }

    public void setOstRows(List<Integer> ostRows){
        this.ostRows = ostRows;
    }


    public void setOstCol(Integer ostCol){
        this.ostCol = ostCol;
    }

    public void setOstColGreaterThanOrEqual(Integer ostColGreaterThanOrEqual){
        this.ostColGreaterThanOrEqual = ostColGreaterThanOrEqual;
    }

    public void setOstColLessThanOrEqual(Integer ostColLessThanOrEqual){
	this.ostColLessThanOrEqual = ostColLessThanOrEqual;
    }

    public void setOstCols(List<Integer> ostCols){
        this.ostCols = ostCols;
    }


    public void setFlag(Integer flag){
        this.flag = flag;
    }

    public void setFlagGreaterThanOrEqual(Integer flagGreaterThanOrEqual){
        this.flagGreaterThanOrEqual = flagGreaterThanOrEqual;
    }

    public void setFlagLessThanOrEqual(Integer flagLessThanOrEqual){
	this.flagLessThanOrEqual = flagLessThanOrEqual;
    }

    public void setFlags(List<Integer> flags){
        this.flags = flags;
    }


    public void setLevel(Integer level){
        this.level = level;
    }

    public void setLevelGreaterThanOrEqual(Integer levelGreaterThanOrEqual){
        this.levelGreaterThanOrEqual = levelGreaterThanOrEqual;
    }

    public void setLevelLessThanOrEqual(Integer levelLessThanOrEqual){
	this.levelLessThanOrEqual = levelLessThanOrEqual;
    }

    public void setLevels(List<Integer> levels){
        this.levels = levels;
    }


    public void setUseTablename(String useTablename){
        this.useTablename = useTablename;
    }

    public void setUseTablenameLike( String useTablenameLike){
	this.useTablenameLike = useTablenameLike;
    }

    public void setUseTablenames(List<String> useTablenames){
        this.useTablenames = useTablenames;
    }


    public void setUseId(String useId){
        this.useId = useId;
    }

    public void setUseIdLike( String useIdLike){
	this.useIdLike = useIdLike;
    }

    public void setUseIds(List<String> useIds){
        this.useIds = useIds;
    }


    public void setUseIndexId(Integer useIndexId){
        this.useIndexId = useIndexId;
    }

    public void setUseIndexIdGreaterThanOrEqual(Integer useIndexIdGreaterThanOrEqual){
        this.useIndexIdGreaterThanOrEqual = useIndexIdGreaterThanOrEqual;
    }

    public void setUseIndexIdLessThanOrEqual(Integer useIndexIdLessThanOrEqual){
	this.useIndexIdLessThanOrEqual = useIndexIdLessThanOrEqual;
    }

    public void setUseIndexIds(List<Integer> useIndexIds){
        this.useIndexIds = useIndexIds;
    }




    public CellUseDataInfoQuery tablename(String tablename){
	if (tablename == null) {
	    throw new RuntimeException("tablename is null");
        }         
	this.tablename = tablename;
	return this;
    }

    public CellUseDataInfoQuery tablenameLike( String tablenameLike){
        if (tablenameLike == null) {
            throw new RuntimeException("tablename is null");
        }
        this.tablenameLike = tablenameLike;
        return this;
    }

    public CellUseDataInfoQuery tablenames(List<String> tablenames){
        if (tablenames == null) {
            throw new RuntimeException("tablenames is empty ");
        }
        this.tablenames = tablenames;
        return this;
    }


    public CellUseDataInfoQuery tableId(String tableId){
	if (tableId == null) {
	    throw new RuntimeException("tableId is null");
        }         
	this.tableId = tableId;
	return this;
    }

    public CellUseDataInfoQuery tableIdLike( String tableIdLike){
        if (tableIdLike == null) {
            throw new RuntimeException("tableId is null");
        }
        this.tableIdLike = tableIdLike;
        return this;
    }

    public CellUseDataInfoQuery tableIds(List<String> tableIds){
        if (tableIds == null) {
            throw new RuntimeException("tableIds is empty ");
        }
        this.tableIds = tableIds;
        return this;
    }


    public CellUseDataInfoQuery ostTablename(Integer ostTablename){
	if (ostTablename == null) {
            throw new RuntimeException("ostTablename is null");
        }         
	this.ostTablename = ostTablename;
	return this;
    }

    public CellUseDataInfoQuery ostTablenameGreaterThanOrEqual(Integer ostTablenameGreaterThanOrEqual){
	if (ostTablenameGreaterThanOrEqual == null) {
	    throw new RuntimeException("ostTablename is null");
        }         
	this.ostTablenameGreaterThanOrEqual = ostTablenameGreaterThanOrEqual;
        return this;
    }

    public CellUseDataInfoQuery ostTablenameLessThanOrEqual(Integer ostTablenameLessThanOrEqual){
        if (ostTablenameLessThanOrEqual == null) {
            throw new RuntimeException("ostTablename is null");
        }
        this.ostTablenameLessThanOrEqual = ostTablenameLessThanOrEqual;
        return this;
    }

    public CellUseDataInfoQuery ostTablenames(List<Integer> ostTablenames){
        if (ostTablenames == null) {
            throw new RuntimeException("ostTablenames is empty ");
        }
        this.ostTablenames = ostTablenames;
        return this;
    }


    public CellUseDataInfoQuery ostRow(Integer ostRow){
	if (ostRow == null) {
            throw new RuntimeException("ostRow is null");
        }         
	this.ostRow = ostRow;
	return this;
    }

    public CellUseDataInfoQuery ostRowGreaterThanOrEqual(Integer ostRowGreaterThanOrEqual){
	if (ostRowGreaterThanOrEqual == null) {
	    throw new RuntimeException("ostRow is null");
        }         
	this.ostRowGreaterThanOrEqual = ostRowGreaterThanOrEqual;
        return this;
    }

    public CellUseDataInfoQuery ostRowLessThanOrEqual(Integer ostRowLessThanOrEqual){
        if (ostRowLessThanOrEqual == null) {
            throw new RuntimeException("ostRow is null");
        }
        this.ostRowLessThanOrEqual = ostRowLessThanOrEqual;
        return this;
    }

    public CellUseDataInfoQuery ostRows(List<Integer> ostRows){
        if (ostRows == null) {
            throw new RuntimeException("ostRows is empty ");
        }
        this.ostRows = ostRows;
        return this;
    }


    public CellUseDataInfoQuery ostCol(Integer ostCol){
	if (ostCol == null) {
            throw new RuntimeException("ostCol is null");
        }         
	this.ostCol = ostCol;
	return this;
    }

    public CellUseDataInfoQuery ostColGreaterThanOrEqual(Integer ostColGreaterThanOrEqual){
	if (ostColGreaterThanOrEqual == null) {
	    throw new RuntimeException("ostCol is null");
        }         
	this.ostColGreaterThanOrEqual = ostColGreaterThanOrEqual;
        return this;
    }

    public CellUseDataInfoQuery ostColLessThanOrEqual(Integer ostColLessThanOrEqual){
        if (ostColLessThanOrEqual == null) {
            throw new RuntimeException("ostCol is null");
        }
        this.ostColLessThanOrEqual = ostColLessThanOrEqual;
        return this;
    }

    public CellUseDataInfoQuery ostCols(List<Integer> ostCols){
        if (ostCols == null) {
            throw new RuntimeException("ostCols is empty ");
        }
        this.ostCols = ostCols;
        return this;
    }


    public CellUseDataInfoQuery flag(Integer flag){
	if (flag == null) {
            throw new RuntimeException("flag is null");
        }         
	this.flag = flag;
	return this;
    }

    public CellUseDataInfoQuery flagGreaterThanOrEqual(Integer flagGreaterThanOrEqual){
	if (flagGreaterThanOrEqual == null) {
	    throw new RuntimeException("flag is null");
        }         
	this.flagGreaterThanOrEqual = flagGreaterThanOrEqual;
        return this;
    }

    public CellUseDataInfoQuery flagLessThanOrEqual(Integer flagLessThanOrEqual){
        if (flagLessThanOrEqual == null) {
            throw new RuntimeException("flag is null");
        }
        this.flagLessThanOrEqual = flagLessThanOrEqual;
        return this;
    }

    public CellUseDataInfoQuery flags(List<Integer> flags){
        if (flags == null) {
            throw new RuntimeException("flags is empty ");
        }
        this.flags = flags;
        return this;
    }


    public CellUseDataInfoQuery level(Integer level){
	if (level == null) {
            throw new RuntimeException("level is null");
        }         
	this.level = level;
	return this;
    }

    public CellUseDataInfoQuery levelGreaterThanOrEqual(Integer levelGreaterThanOrEqual){
	if (levelGreaterThanOrEqual == null) {
	    throw new RuntimeException("level is null");
        }         
	this.levelGreaterThanOrEqual = levelGreaterThanOrEqual;
        return this;
    }

    public CellUseDataInfoQuery levelLessThanOrEqual(Integer levelLessThanOrEqual){
        if (levelLessThanOrEqual == null) {
            throw new RuntimeException("level is null");
        }
        this.levelLessThanOrEqual = levelLessThanOrEqual;
        return this;
    }

    public CellUseDataInfoQuery levels(List<Integer> levels){
        if (levels == null) {
            throw new RuntimeException("levels is empty ");
        }
        this.levels = levels;
        return this;
    }


    public CellUseDataInfoQuery useTablename(String useTablename){
	if (useTablename == null) {
	    throw new RuntimeException("useTablename is null");
        }         
	this.useTablename = useTablename;
	return this;
    }

    public CellUseDataInfoQuery useTablenameLike( String useTablenameLike){
        if (useTablenameLike == null) {
            throw new RuntimeException("useTablename is null");
        }
        this.useTablenameLike = useTablenameLike;
        return this;
    }

    public CellUseDataInfoQuery useTablenames(List<String> useTablenames){
        if (useTablenames == null) {
            throw new RuntimeException("useTablenames is empty ");
        }
        this.useTablenames = useTablenames;
        return this;
    }


    public CellUseDataInfoQuery useId(String useId){
	if (useId == null) {
	    throw new RuntimeException("useId is null");
        }         
	this.useId = useId;
	return this;
    }

    public CellUseDataInfoQuery useIdLike( String useIdLike){
        if (useIdLike == null) {
            throw new RuntimeException("useId is null");
        }
        this.useIdLike = useIdLike;
        return this;
    }

    public CellUseDataInfoQuery useIds(List<String> useIds){
        if (useIds == null) {
            throw new RuntimeException("useIds is empty ");
        }
        this.useIds = useIds;
        return this;
    }


    public CellUseDataInfoQuery useIndexId(Integer useIndexId){
	if (useIndexId == null) {
            throw new RuntimeException("useIndexId is null");
        }         
	this.useIndexId = useIndexId;
	return this;
    }

    public CellUseDataInfoQuery useIndexIdGreaterThanOrEqual(Integer useIndexIdGreaterThanOrEqual){
	if (useIndexIdGreaterThanOrEqual == null) {
	    throw new RuntimeException("useIndexId is null");
        }         
	this.useIndexIdGreaterThanOrEqual = useIndexIdGreaterThanOrEqual;
        return this;
    }

    public CellUseDataInfoQuery useIndexIdLessThanOrEqual(Integer useIndexIdLessThanOrEqual){
        if (useIndexIdLessThanOrEqual == null) {
            throw new RuntimeException("useIndexId is null");
        }
        this.useIndexIdLessThanOrEqual = useIndexIdLessThanOrEqual;
        return this;
    }

    public CellUseDataInfoQuery useIndexIds(List<Integer> useIndexIds){
        if (useIndexIds == null) {
            throw new RuntimeException("useIndexIds is empty ");
        }
        this.useIndexIds = useIndexIds;
        return this;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getOrderBy() {
        if (sortField != null) {
            String a_x = " asc ";
            if (getSortOrder()!= null) {
                a_x = " desc ";
            }

            if (columns.get(sortField) != null) {
				orderBy = " E." + columns.get(sortField) + a_x;
			}
        }
        return orderBy;
    }

    @Override
    public void initQueryColumns(){
        super.initQueryColumns();
        addColumn("id", "id");
        addColumn("tablename", "table_name");
        addColumn("tableId", "table_id");
        addColumn("ostTablename", "ost_tablename");
        addColumn("ostRow", "ost_row");
        addColumn("ostCol", "ost_col");
        addColumn("flag", "flag");
        addColumn("level", "treenlevel");
        addColumn("useTablename", "use_tablename");
        addColumn("useId", "use_id");
        addColumn("useIndexId", "use_index_id");
    }

}