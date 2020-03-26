package com.ability.model;

import com.microsoft.sqlserver.jdbc.SQLServerDataTable;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

public class Acg {

        private Integer acgid;
        private Integer bkid;
        private Integer pid;
        private String grpcde;
        private Integer gid;
        private String desp;
        private Integer curid;
        private Boolean reserve;

    private String Product;
    private String Currency;
    private String AccountType;
    private String AccountNo;
    
        public Integer getAcgid() {
            return acgid;
        }

        public void setAcgid(Integer acgid) {
            this.acgid = acgid;
        }

        public Integer getBkid() {
            return bkid;
        }

        public void setBkid(Integer bkid) {
            this.bkid = bkid;
        }

        public Integer getPid() {
            return pid;
        }

        public void setPid(Integer pid) {
            this.pid = pid;
        }

        public String getGrpcde() {
            return grpcde;
        }

        public void setGrpcde(String grpcde) {
            this.grpcde = grpcde;
        }

        public Integer getGid() {
            return gid;
        }

        public void setGid(Integer gid) {
            this.gid = gid;
        }

        public String getDesp() {
            return desp;
        }

        public void setDesp(String desp) {
            this.desp = desp;
        }

        public Integer getCurid() {
            return curid;
        }

        public void setCurid(Integer curid) {
            this.curid = curid;
        }

        public Boolean getReserve() {
            return reserve;
        }

        public void setReserve(Boolean reserve) {
            this.reserve = reserve;
        }
        
    public String getProduct() {
        return Product;
    }

    public void setProduct(String Product) {
        this.Product = Product;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }
    
         public SQLServerDataTable getACGTableStructure() throws SQLServerException {

                    SQLServerDataTable sourceDataTable = new SQLServerDataTable();
                    sourceDataTable.addColumnMetadata("ACGID", java.sql.Types.SMALLINT);
                    sourceDataTable.addColumnMetadata("BKID", java.sql.Types.SMALLINT);
                    sourceDataTable.addColumnMetadata("PID", java.sql.Types.SMALLINT);
                    sourceDataTable.addColumnMetadata("GRPCDE", java.sql.Types.VARCHAR);
                    sourceDataTable.addColumnMetadata("GID", java.sql.Types.INTEGER);
                    sourceDataTable.addColumnMetadata("DESP", java.sql.Types.NVARCHAR);
                    sourceDataTable.addColumnMetadata("CURID", java.sql.Types.SMALLINT);
                    sourceDataTable.addColumnMetadata("RESERVE", java.sql.Types.BIT);

        sourceDataTable.addRow(acgid, bkid, pid, grpcde, gid, desp, curid, reserve);

                    return sourceDataTable;
           }
         
          @PostConstruct
            public void init() {

                this.acgid = 0;
                this.bkid = 0;
                this.pid = 0;
                this.grpcde = "";
                this.gid = 0;
                this.desp = "";
                this.curid = 0;
                this.reserve = false;

            }
      
    public void Acg() {

        this.acgid = 0;
        this.bkid = 0;
        this.pid = 0;
        this.grpcde = "";
        this.gid = 0;
        this.desp = "";
        this.curid = 0;
        this.reserve = false;

    } 
        //akm commented in this line
        //akm comented in this line akm2dwl
}
