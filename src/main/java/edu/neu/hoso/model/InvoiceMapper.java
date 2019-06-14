package edu.neu.hoso.model;

import edu.neu.hoso.example.InvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface InvoiceMapper {
    int countByExample(InvoiceExample example);

    int deleteByExample(InvoiceExample example);

    @Delete({
        "delete from invoice",
        "where Invoice_ID = #{invoiceId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer invoiceId);

    @Insert({
        "insert into invoice (Invoice_NO, Total_Cost, ",
        "Is_Day_Cal, Pay_Time, ",
        "User_ID, Pay_Mode_ID)",
        "values (#{invoiceNo,jdbcType=INTEGER}, #{totalCost,jdbcType=DOUBLE}, ",
        "#{isDayCal,jdbcType=CHAR}, #{payTime,jdbcType=TIMESTAMP}, ",
        "#{userId,jdbcType=INTEGER}, #{payModeId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="invoiceId", before=false, resultType=Integer.class)
    int insert(Invoice record);

    int insertSelective(Invoice record);

    List<Invoice> selectByExample(InvoiceExample example);

    @Select({
        "select",
        "Invoice_ID, Invoice_NO, Total_Cost, Is_Day_Cal, Pay_Time, User_ID, Pay_Mode_ID",
        "from invoice",
        "where Invoice_ID = #{invoiceId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Invoice selectByPrimaryKey(Integer invoiceId);

    int updateByExampleSelective(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    int updateByExample(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    int updateByPrimaryKeySelective(Invoice record);

    @Update({
        "update invoice",
        "set Invoice_NO = #{invoiceNo,jdbcType=INTEGER},",
          "Total_Cost = #{totalCost,jdbcType=DOUBLE},",
          "Is_Day_Cal = #{isDayCal,jdbcType=CHAR},",
          "Pay_Time = #{payTime,jdbcType=TIMESTAMP},",
          "User_ID = #{userId,jdbcType=INTEGER},",
          "Pay_Mode_ID = #{payModeId,jdbcType=INTEGER}",
        "where Invoice_ID = #{invoiceId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Invoice record);
}