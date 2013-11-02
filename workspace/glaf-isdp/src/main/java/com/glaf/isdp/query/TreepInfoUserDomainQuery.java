package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreepInfoUserDomainQuery extends DataQuery {
        private static final long serialVersionUID = 1L;
  	protected Integer domainindex;
  	protected Integer domainindexGreaterThanOrEqual;
  	protected Integer domainindexLessThanOrEqual;
  	protected List<Integer> domainindexs;
  	protected Integer uindexId;
  	protected Integer uindexIdGreaterThanOrEqual;
  	protected Integer uindexIdLessThanOrEqual;
  	protected List<Integer> uindexIds;
	

    public TreepInfoUserDomainQuery() {

    }


    public Integer getDomainindex(){
        return domainindex;
    }

    public Integer getDomainindexGreaterThanOrEqual(){
        return domainindexGreaterThanOrEqual;
    }

    public Integer getDomainindexLessThanOrEqual(){
	return domainindexLessThanOrEqual;
    }

    public List<Integer> getDomainindexs(){
	return domainindexs;
    }


    public Integer getUindexId(){
        return uindexId;
    }

    public Integer getUindexIdGreaterThanOrEqual(){
        return uindexIdGreaterThanOrEqual;
    }

    public Integer getUindexIdLessThanOrEqual(){
	return uindexIdLessThanOrEqual;
    }

    public List<Integer> getUindexIds(){
	return uindexIds;
    }



    public void setDomainindex(Integer domainindex){
        this.domainindex = domainindex;
    }

    public void setDomainindexGreaterThanOrEqual(Integer domainindexGreaterThanOrEqual){
        this.domainindexGreaterThanOrEqual = domainindexGreaterThanOrEqual;
    }

    public void setDomainindexLessThanOrEqual(Integer domainindexLessThanOrEqual){
	this.domainindexLessThanOrEqual = domainindexLessThanOrEqual;
    }

    public void setDomainindexs(List<Integer> domainindexs){
        this.domainindexs = domainindexs;
    }


    public void setUindexId(Integer uindexId){
        this.uindexId = uindexId;
    }

    public void setUindexIdGreaterThanOrEqual(Integer uindexIdGreaterThanOrEqual){
        this.uindexIdGreaterThanOrEqual = uindexIdGreaterThanOrEqual;
    }

    public void setUindexIdLessThanOrEqual(Integer uindexIdLessThanOrEqual){
	this.uindexIdLessThanOrEqual = uindexIdLessThanOrEqual;
    }

    public void setUindexIds(List<Integer> uindexIds){
        this.uindexIds = uindexIds;
    }




    public TreepInfoUserDomainQuery domainindex(Integer domainindex){
	if (domainindex == null) {
            throw new RuntimeException("domainindex is null");
        }         
	this.domainindex = domainindex;
	return this;
    }

    public TreepInfoUserDomainQuery domainindexGreaterThanOrEqual(Integer domainindexGreaterThanOrEqual){
	if (domainindexGreaterThanOrEqual == null) {
	    throw new RuntimeException("domainindex is null");
        }         
	this.domainindexGreaterThanOrEqual = domainindexGreaterThanOrEqual;
        return this;
    }

    public TreepInfoUserDomainQuery domainindexLessThanOrEqual(Integer domainindexLessThanOrEqual){
        if (domainindexLessThanOrEqual == null) {
            throw new RuntimeException("domainindex is null");
        }
        this.domainindexLessThanOrEqual = domainindexLessThanOrEqual;
        return this;
    }

    public TreepInfoUserDomainQuery domainindexs(List<Integer> domainindexs){
        if (domainindexs == null) {
            throw new RuntimeException("domainindexs is empty ");
        }
        this.domainindexs = domainindexs;
        return this;
    }


    public TreepInfoUserDomainQuery uindexId(Integer uindexId){
	if (uindexId == null) {
            throw new RuntimeException("uindexId is null");
        }         
	this.uindexId = uindexId;
	return this;
    }

    public TreepInfoUserDomainQuery uindexIdGreaterThanOrEqual(Integer uindexIdGreaterThanOrEqual){
	if (uindexIdGreaterThanOrEqual == null) {
	    throw new RuntimeException("uindexId is null");
        }         
	this.uindexIdGreaterThanOrEqual = uindexIdGreaterThanOrEqual;
        return this;
    }

    public TreepInfoUserDomainQuery uindexIdLessThanOrEqual(Integer uindexIdLessThanOrEqual){
        if (uindexIdLessThanOrEqual == null) {
            throw new RuntimeException("uindexId is null");
        }
        this.uindexIdLessThanOrEqual = uindexIdLessThanOrEqual;
        return this;
    }

    public TreepInfoUserDomainQuery uindexIds(List<Integer> uindexIds){
        if (uindexIds == null) {
            throw new RuntimeException("uindexIds is empty ");
        }
        this.uindexIds = uindexIds;
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
        addColumn("domainindex", "domainindex");
        addColumn("uindexId", "uindex_id");
    }

}