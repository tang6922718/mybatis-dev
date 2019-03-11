package cn.com.bonc.marketcloud.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface ActivityMapper {


    //1.使用内部类，构造并处理sql
    // @InsertProvider(type=InfoDynaSqlProvider.class,
    //            method="addInfo")
    //    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    //    int addInfo(Map<String, Object> map);

    //使用标签<script>的方式构造sql
   /* @Select({"<script>",
            "SELECT * FROM `info_basic`",
            "WHERE is_display='1'",
            "<when test='catCode!=null' >",
            "AND cat_code = #{catCode}",
            "</when>",
            "<when test='status!=null' >",
            "AND status = #{status}",
            "</when>",
            "</script>"})
    @ResultType(List.class)
    List<Map> getAllInfo();*/

    @Select("SELECT * FROM epm_activity_info ")
    List<Map> getTopic();


    //利用concat查询多个字段，并进行模糊查询
    @Select({"<script>",
            "SELECT * FROM epm_activity_info ",
            "where 1=1",
            "<when test='keyWord!=null'>",
            "AND CONCAT(IFNULL(ACTIVITY_DESC,''),IFNULL(ACTIVITY_NAME,''),IFNULL(ACTIVITY_CREATE_NAME,''))",
            " LIKE CONCAT('%',#{keyWord},'%')",
            "</when>",
            "</script>"})
    List<Map> selectActivityInfoList(@Param("keyWord") String keyWord);


   /* class InfoDynaSqlProvider {
        public String addInfo(final Map<String,Object> map)
        {
            return new SQL() {{
                INSERT_INTO("info_basic");
                if (map.get("id") != null) {
                    VALUES("id", "#{id}");
                }
                if (map.get("title") != null) {
                    VALUES("title", "#{title}");
                }
                if (map.get("abstract") != null) {
                    VALUES("abstract", "#{abstract}");
                }
                if (map.get("source_code") != null) {
                    VALUES("source_code", "#{source_code}");
                }
                if (map.get("cat_code") != null) {
                    VALUES("cat_code", "#{cat_code}");
                }
                if (map.get("img_url") != null) {
                    VALUES("img_url", "#{img_url}");
                }
                if (map.get("is_top_line") != null) {
                    VALUES("is_top_line", "#{is_top_line}");
                }
                if (map.get("is_market_top") != null) {
                    VALUES("is_market_top", "#{is_market_top}");
                }
                if (map.get("is_alarm") != null) {
                    VALUES("is_alarm", "#{is_alarm}");
                }
                if (map.get("is_real") != null) {
                    VALUES("is_real","#{is_real}");
                }
                if (map.get("is_pest") != null) {
                    VALUES("is_pest","#{is_pest}");
                }
                if (map.get("content") != null) {
                    VALUES("content", "#{content}");
                }
                if (map.get("status") != null) {
                    VALUES("status", "#{status}");
                }
                if (map.get("user_id") != null) {
                    VALUES("user_id", "#{user_id}");
                }
                VALUES("update_date", "now()");
            }}.toString();
        }
    }*/
}
