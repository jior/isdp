package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellTcadbmpQuery extends DataQuery {
        private static final long serialVersionUID = 1L;
  	protected Integer filetype;
  	protected Integer filetypeGreaterThanOrEqual;
  	protected Integer filetypeLessThanOrEqual;
  	protected List<Integer> filetypes;
  	protected String fileid;
  	protected String fileidLike;
  	protected List<String> fileids;
  	protected String ostTablename;
  	protected String ostTablenameLike;
  	protected List<String> ostTablenames;
  	protected Integer ostRow;
  	protected Integer ostRowGreaterThanOrEqual;
  	protected Integer ostRowLessThanOrEqual;
  	protected List<Integer> ostRows;
  	protected Integer ostCol;
  	protected Integer ostColGreaterThanOrEqual;
  	protected Integer ostColLessThanOrEqual;
  	protected List<Integer> ostCols;
  	protected String ostCellid;
  	protected String ostCellidLike;
  	protected List<String> ostCellids;
  	protected String fileName;
  	protected String fileNameLike;
  	protected List<String> fileNames;
	

    public CellTcadbmpQuery() {

    }


    public Integer getFiletype(){
        return filetype;
    }

    public Integer getFiletypeGreaterThanOrEqual(){
        return filetypeGreaterThanOrEqual;
    }

    public Integer getFiletypeLessThanOrEqual(){
	return filetypeLessThanOrEqual;
    }

    public List<Integer> getFiletypes(){
	return filetypes;
    }


    public String getFileid(){
        return fileid;
    }

    public String getFileidLike(){
	    if (fileidLike != null && fileidLike.trim().length() > 0) {
		if (!fileidLike.startsWith("%")) {
		    fileidLike = "%" + fileidLike;
		}
		if (!fileidLike.endsWith("%")) {
		   fileidLike = fileidLike + "%";
		}
	    }
	return fileidLike;
    }

    public List<String> getFileids(){
	return fileids;
    }


    public String getOstTablename(){
        return ostTablename;
    }

    public String getOstTablenameLike(){
	    if (ostTablenameLike != null && ostTablenameLike.trim().length() > 0) {
		if (!ostTablenameLike.startsWith("%")) {
		    ostTablenameLike = "%" + ostTablenameLike;
		}
		if (!ostTablenameLike.endsWith("%")) {
		   ostTablenameLike = ostTablenameLike + "%";
		}
	    }
	return ostTablenameLike;
    }

    public List<String> getOstTablenames(){
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


    public String getOstCellid(){
        return ostCellid;
    }

    public String getOstCellidLike(){
	    if (ostCellidLike != null && ostCellidLike.trim().length() > 0) {
		if (!ostCellidLike.startsWith("%")) {
		    ostCellidLike = "%" + ostCellidLike;
		}
		if (!ostCellidLike.endsWith("%")) {
		   ostCellidLike = ostCellidLike + "%";
		}
	    }
	return ostCellidLike;
    }

    public List<String> getOstCellids(){
	return ostCellids;
    }


    public String getFileName(){
        return fileName;
    }

    public String getFileNameLike(){
	    if (fileNameLike != null && fileNameLike.trim().length() > 0) {
		if (!fileNameLike.startsWith("%")) {
		    fileNameLike = "%" + fileNameLike;
		}
		if (!fileNameLike.endsWith("%")) {
		   fileNameLike = fileNameLike + "%";
		}
	    }
	return fileNameLike;
    }

    public List<String> getFileNames(){
	return fileNames;
    }



    public void setFiletype(Integer filetype){
        this.filetype = filetype;
    }

    public void setFiletypeGreaterThanOrEqual(Integer filetypeGreaterThanOrEqual){
        this.filetypeGreaterThanOrEqual = filetypeGreaterThanOrEqual;
    }

    public void setFiletypeLessThanOrEqual(Integer filetypeLessThanOrEqual){
	this.filetypeLessThanOrEqual = filetypeLessThanOrEqual;
    }

    public void setFiletypes(List<Integer> filetypes){
        this.filetypes = filetypes;
    }


    public void setFileid(String fileid){
        this.fileid = fileid;
    }

    public void setFileidLike( String fileidLike){
	this.fileidLike = fileidLike;
    }

    public void setFileids(List<String> fileids){
        this.fileids = fileids;
    }


    public void setOstTablename(String ostTablename){
        this.ostTablename = ostTablename;
    }

    public void setOstTablenameLike( String ostTablenameLike){
	this.ostTablenameLike = ostTablenameLike;
    }

    public void setOstTablenames(List<String> ostTablenames){
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


    public void setOstCellid(String ostCellid){
        this.ostCellid = ostCellid;
    }

    public void setOstCellidLike( String ostCellidLike){
	this.ostCellidLike = ostCellidLike;
    }

    public void setOstCellids(List<String> ostCellids){
        this.ostCellids = ostCellids;
    }


    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public void setFileNameLike( String fileNameLike){
	this.fileNameLike = fileNameLike;
    }

    public void setFileNames(List<String> fileNames){
        this.fileNames = fileNames;
    }




    public CellTcadbmpQuery filetype(Integer filetype){
	if (filetype == null) {
            throw new RuntimeException("filetype is null");
        }         
	this.filetype = filetype;
	return this;
    }

    public CellTcadbmpQuery filetypeGreaterThanOrEqual(Integer filetypeGreaterThanOrEqual){
	if (filetypeGreaterThanOrEqual == null) {
	    throw new RuntimeException("filetype is null");
        }         
	this.filetypeGreaterThanOrEqual = filetypeGreaterThanOrEqual;
        return this;
    }

    public CellTcadbmpQuery filetypeLessThanOrEqual(Integer filetypeLessThanOrEqual){
        if (filetypeLessThanOrEqual == null) {
            throw new RuntimeException("filetype is null");
        }
        this.filetypeLessThanOrEqual = filetypeLessThanOrEqual;
        return this;
    }

    public CellTcadbmpQuery filetypes(List<Integer> filetypes){
        if (filetypes == null) {
            throw new RuntimeException("filetypes is empty ");
        }
        this.filetypes = filetypes;
        return this;
    }


    public CellTcadbmpQuery fileid(String fileid){
	if (fileid == null) {
	    throw new RuntimeException("fileid is null");
        }         
	this.fileid = fileid;
	return this;
    }

    public CellTcadbmpQuery fileidLike( String fileidLike){
        if (fileidLike == null) {
            throw new RuntimeException("fileid is null");
        }
        this.fileidLike = fileidLike;
        return this;
    }

    public CellTcadbmpQuery fileids(List<String> fileids){
        if (fileids == null) {
            throw new RuntimeException("fileids is empty ");
        }
        this.fileids = fileids;
        return this;
    }


    public CellTcadbmpQuery ostTablename(String ostTablename){
	if (ostTablename == null) {
	    throw new RuntimeException("ostTablename is null");
        }         
	this.ostTablename = ostTablename;
	return this;
    }

    public CellTcadbmpQuery ostTablenameLike( String ostTablenameLike){
        if (ostTablenameLike == null) {
            throw new RuntimeException("ostTablename is null");
        }
        this.ostTablenameLike = ostTablenameLike;
        return this;
    }

    public CellTcadbmpQuery ostTablenames(List<String> ostTablenames){
        if (ostTablenames == null) {
            throw new RuntimeException("ostTablenames is empty ");
        }
        this.ostTablenames = ostTablenames;
        return this;
    }


    public CellTcadbmpQuery ostRow(Integer ostRow){
	if (ostRow == null) {
            throw new RuntimeException("ostRow is null");
        }         
	this.ostRow = ostRow;
	return this;
    }

    public CellTcadbmpQuery ostRowGreaterThanOrEqual(Integer ostRowGreaterThanOrEqual){
	if (ostRowGreaterThanOrEqual == null) {
	    throw new RuntimeException("ostRow is null");
        }         
	this.ostRowGreaterThanOrEqual = ostRowGreaterThanOrEqual;
        return this;
    }

    public CellTcadbmpQuery ostRowLessThanOrEqual(Integer ostRowLessThanOrEqual){
        if (ostRowLessThanOrEqual == null) {
            throw new RuntimeException("ostRow is null");
        }
        this.ostRowLessThanOrEqual = ostRowLessThanOrEqual;
        return this;
    }

    public CellTcadbmpQuery ostRows(List<Integer> ostRows){
        if (ostRows == null) {
            throw new RuntimeException("ostRows is empty ");
        }
        this.ostRows = ostRows;
        return this;
    }


    public CellTcadbmpQuery ostCol(Integer ostCol){
	if (ostCol == null) {
            throw new RuntimeException("ostCol is null");
        }         
	this.ostCol = ostCol;
	return this;
    }

    public CellTcadbmpQuery ostColGreaterThanOrEqual(Integer ostColGreaterThanOrEqual){
	if (ostColGreaterThanOrEqual == null) {
	    throw new RuntimeException("ostCol is null");
        }         
	this.ostColGreaterThanOrEqual = ostColGreaterThanOrEqual;
        return this;
    }

    public CellTcadbmpQuery ostColLessThanOrEqual(Integer ostColLessThanOrEqual){
        if (ostColLessThanOrEqual == null) {
            throw new RuntimeException("ostCol is null");
        }
        this.ostColLessThanOrEqual = ostColLessThanOrEqual;
        return this;
    }

    public CellTcadbmpQuery ostCols(List<Integer> ostCols){
        if (ostCols == null) {
            throw new RuntimeException("ostCols is empty ");
        }
        this.ostCols = ostCols;
        return this;
    }


    public CellTcadbmpQuery ostCellid(String ostCellid){
	if (ostCellid == null) {
	    throw new RuntimeException("ostCellid is null");
        }         
	this.ostCellid = ostCellid;
	return this;
    }

    public CellTcadbmpQuery ostCellidLike( String ostCellidLike){
        if (ostCellidLike == null) {
            throw new RuntimeException("ostCellid is null");
        }
        this.ostCellidLike = ostCellidLike;
        return this;
    }

    public CellTcadbmpQuery ostCellids(List<String> ostCellids){
        if (ostCellids == null) {
            throw new RuntimeException("ostCellids is empty ");
        }
        this.ostCellids = ostCellids;
        return this;
    }


    public CellTcadbmpQuery fileName(String fileName){
	if (fileName == null) {
	    throw new RuntimeException("fileName is null");
        }         
	this.fileName = fileName;
	return this;
    }

    public CellTcadbmpQuery fileNameLike( String fileNameLike){
        if (fileNameLike == null) {
            throw new RuntimeException("fileName is null");
        }
        this.fileNameLike = fileNameLike;
        return this;
    }

    public CellTcadbmpQuery fileNames(List<String> fileNames){
        if (fileNames == null) {
            throw new RuntimeException("fileNames is empty ");
        }
        this.fileNames = fileNames;
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
        addColumn("filetype", "filetype");
        addColumn("fileid", "fileid");
        addColumn("ostTablename", "ost_tablename");
        addColumn("ostRow", "ost_row");
        addColumn("ostCol", "ost_col");
        addColumn("ostCellid", "ost_cellid");
        addColumn("fileName", "file_name");
    }

}