<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div class="Dash_body">
    <section class="top_line">
        <div class="jfbet">
            <h2 class="top_title control_title">
                진행 현황
                <div class="time_explain">
<%--                    <p class="call">최종로딩시간</p>--%>
<%--                    <p class="time_box">--%>
<%--                        <span class="time_load" id="serverTime"></span>--%>
<%--                    </p>--%>
                </div>
            </h2>
            <div class="location">
                <p>
                    <img class="ion" src="${pageContext.request.contextPath}/assets/images/sv_home.svg">Home
                </p>
                <p class="arrow">
                    <img src="${pageContext.request.contextPath}/assets/images/sv_arr_loc.svg">
                </p>
                <p>진행 현황</p>
            </div><!--location-->
        </div>
    </section><!-- top_line -->

    <section class="content">

        <div class="row">
            <div class="col-lg-4">
                <dl class="dsconts h320">
                    <dt>
                        <article class="jfbet">
                            <h3>
                                <span class="hormark"></span>
                                <span class="htitle">작업 일정 완료 예정(영업일 기준)</span>
                            </h3>
                        </article>
                    </dt>
                    <dd>
                        <div class="big_respon1">
                            <article class="big_status flx_jfcent m-t-30">
                                <div class="another_status m-r-40">
                                    <div class="ano_line" >
                                        <p class="left">
                                            <span>편집 일정 : ${editPlan.beginDay} ~ ${editPlan.dDay} - ${editPlan.dDayCount}일</span>
                                            <br/>
                                            <span>실사 일정 : ${inspectionPlan.dDay} - ${inspectionPlan.dDayCount}일</span>
                                            <br/>
                                            <span>유효 그리드 현황 : ${gridCount.workGridCount} / ${gridCount.allGridCount} (${gridCount.allGridP}%)</span>
                                            <br/>
                                            <span>서울시내 그리드 작업 현황</span>
                                            <br/>
                                            <span>실사 에정 그리드 현황</span>
                                            <br/>
                                            <span>링크/노드 입력 현황</span>
                                            <br/>
                                            <span>신규 추가 링크 / 노드 입력 현황</span>
                                        </p>
                                    </div><!--ano_line-->
                                </div><!--another_status-->
                            </article><!--big_status-->
                        </div>
                    </dd>
                </dl><!-- dsconts -->
            </div><!-- col-lg-4 -->
            <div class="col-lg-4">
                <dl class="dsconts h320">
                    <dt>
                        <article class="jfbet">
                            <h3>
                                <span class="hormark"></span>
                                <span class="htitle">목적별</span>
                            </h3>
                            <div class="betw_right">
                                <button type="button" id="serviceDailyButton" class="btn btn-yg1">일간</button>
                                <button type="button" id="serviceMonthlyButton" class="btn btn-wh1 m-l-5">월간</button>
                            </div>
                        </article>
                    </dt>
                    <dd>
                        <!-- 일간 -->
                        <div class="big_respon1" id="serviceDaily">
                            <article class="big_status flx_jfcent flx_aicent no_flwrap m-t-30">
                                <div class="img_chart w-35 p-r-15 m-b-5" id="serviceDayChart">불러오는중</div>
                                <div class="another_status purpose_status" id="serviceDayLegend">불러오는중</div>
                            </article><!--big_status-->
                        </div>
                        <!-- 월간 -->
                        <div class="big_respon1" id="serviceMonthly">
                            <article class="big_status flx_jfcent flx_aicent no_flwrap m-t-30">
                                <div class="img_chart w-35 p-r-15 m-b-5" id="serviceMonthChart">불러오는중</div>
                                <div class="another_status purpose_status" id="serviceMonthLegend">불러오는중</div>
                            </article><!--big_status-->
                        </div>
                    </dd>
                </dl><!-- dsconts -->
            </div><!-- col-lg-4 -->
        </div><!-- row -->

        <div class="row">
            <div class="col-lg-6">
                <dl class="dsconts h370">
                    <dt>
                        <article class="jfbet">
                            <h3>
                                <span class="hormark"></span>
                                <span class="htitle">최근 이용내역</span>
                            </h3>
                        </article>
                    </dt>
                    <dd>
                        <div class="big_respon1">
                            <div class="table_box">
                                <table class="gray_table bigger_table grtable1" id="recentUsingTable">
                                    <thead>
                                    <tr>
                                        <th>번호</th>
                                        <th>종료시간</th>
                                        <th>성명</th>
                                        <th>소속기관명</th>
                                    </tr>
                                    </thead>
                                </table>
                            </div><!--table_box-->
                        </div>
                    </dd>
                </dl><!-- dsconts -->
            </div><!--col-lg-6-->
            <div class="col-lg-6">
                <dl class="dsconts h370">
                    <dt>
                        <article class="jfbet">
                            <h3>
                                <span class="hormark"></span>
                                <span class="htitle">설문조사 현황</span>
                            </h3>
                            <div class="betw_right">
                                <select class="form-control selbox slmr1 w150">
                                    <c:forEach var="surveyCombo" items="${surveyCombo}" varStatus="status">
                                        <option value="${surveyCombo.surveyId}">${surveyCombo.title}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </article>
                    </dt>
                    <dd>
                        <div class="big_respon1">
                            <article class="big_status flx_jfcent flx_aicent">
                                <div class="question table_box">
                                    <table class="question_table gray_table">
                                        <thead>
                                        <tr>
                                            <th>번호</th>
                                            <th>문항</th>
                                            <th>점수</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        </tbody>
                                    </table>
                                </div>
                            </article><!--big_status-->
                        </div>
                    </dd>
                </dl><!-- dsconts -->
            </div><!-- col-lg-12 -->
        </div><!--row-->
    </section><!-- content -->
</div>

<%--<script src="${pageContext.request.contextPath}/resources/js/main/index.js" type="text/javascript"></script>--%>
