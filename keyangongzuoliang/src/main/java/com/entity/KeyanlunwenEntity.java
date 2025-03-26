package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 科研论文
 *
 * @author 
 * @email
 */
@TableName("keyanlunwen")
public class KeyanlunwenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KeyanlunwenEntity() {

	}

	public KeyanlunwenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 科研论文名称
     */
    @TableField(value = "keyanlunwen_name")

    private String keyanlunwenName;


    /**
     * 科研论文类型
     */
    @TableField(value = "keyanlunwen_types")

    private Integer keyanlunwenTypes;


    /**
     * 相关文件
     */
    @TableField(value = "keyanlunwen_file")

    private String keyanlunwenFile;


    /**
     * 科研论文详情
     */
    @TableField(value = "keyanlunwen_content")

    private String keyanlunwenContent;


    /**
     * 逻辑删除
     */
    @TableField(value = "keyanlunwen_delete")

    private Integer keyanlunwenDelete;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 审核状态
     */
    @TableField(value = "keyanlunwen_yesno_types")

    private Integer keyanlunwenYesnoTypes;


    /**
     * 审核意见
     */
    @TableField(value = "keyanlunwen_yesno_text")

    private String keyanlunwenYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：科研论文名称
	 */
    public String getKeyanlunwenName() {
        return keyanlunwenName;
    }


    /**
	 * 获取：科研论文名称
	 */

    public void setKeyanlunwenName(String keyanlunwenName) {
        this.keyanlunwenName = keyanlunwenName;
    }
    /**
	 * 设置：科研论文类型
	 */
    public Integer getKeyanlunwenTypes() {
        return keyanlunwenTypes;
    }


    /**
	 * 获取：科研论文类型
	 */

    public void setKeyanlunwenTypes(Integer keyanlunwenTypes) {
        this.keyanlunwenTypes = keyanlunwenTypes;
    }
    /**
	 * 设置：相关文件
	 */
    public String getKeyanlunwenFile() {
        return keyanlunwenFile;
    }


    /**
	 * 获取：相关文件
	 */

    public void setKeyanlunwenFile(String keyanlunwenFile) {
        this.keyanlunwenFile = keyanlunwenFile;
    }
    /**
	 * 设置：科研论文详情
	 */
    public String getKeyanlunwenContent() {
        return keyanlunwenContent;
    }


    /**
	 * 获取：科研论文详情
	 */

    public void setKeyanlunwenContent(String keyanlunwenContent) {
        this.keyanlunwenContent = keyanlunwenContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getKeyanlunwenDelete() {
        return keyanlunwenDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setKeyanlunwenDelete(Integer keyanlunwenDelete) {
        this.keyanlunwenDelete = keyanlunwenDelete;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getKeyanlunwenYesnoTypes() {
        return keyanlunwenYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setKeyanlunwenYesnoTypes(Integer keyanlunwenYesnoTypes) {
        this.keyanlunwenYesnoTypes = keyanlunwenYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getKeyanlunwenYesnoText() {
        return keyanlunwenYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setKeyanlunwenYesnoText(String keyanlunwenYesnoText) {
        this.keyanlunwenYesnoText = keyanlunwenYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Keyanlunwen{" +
            "id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", keyanlunwenName=" + keyanlunwenName +
            ", keyanlunwenTypes=" + keyanlunwenTypes +
            ", keyanlunwenFile=" + keyanlunwenFile +
            ", keyanlunwenContent=" + keyanlunwenContent +
            ", keyanlunwenDelete=" + keyanlunwenDelete +
            ", insertTime=" + insertTime +
            ", keyanlunwenYesnoTypes=" + keyanlunwenYesnoTypes +
            ", keyanlunwenYesnoText=" + keyanlunwenYesnoText +
            ", updateTime=" + updateTime +
            ", createTime=" + createTime +
        "}";
    }
}
