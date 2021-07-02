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
            <div class="col-lg-6">
                <dl class="dsconts h320">
                    <dt>
                        <article class="jfbet">
                            <h3>
                                <span class="hormark"></span>
                                <span class="htitle">작업 일정(영업일 기준)</span>
                            </h3>
                        </article>
                    </dt>
                    <dd>
                        <div class="big_respon1">
                            <article class="big_status flx_jfcent m-t-30">
                                <div class="another_status m-r-40">
                                    <div class="ano_line" >
                                        <p class="left">
                                            <span>편집 일정 : ${plan.editFrom} ~ ${plan.editTo}(${plan.editPlan}일)</span>
                                            <br/>
                                            <span>실사 일정 : ${plan.inspectionFrom} ~ ${plan.inspectionTo}(${plan.inspectionPlan}일)</span>
                                        </p>
                                    </div><!--ano_line-->
                                </div><!--another_status-->
                            </article><!--big_status-->
                        </div>
                    </dd>
                </dl><!-- dsconts -->
            </div><!-- col-lg-4 -->
            <div class="col-lg-6">
                <dl class="dsconts h320">
                    <dt>
                        <article class="jfbet">
                            <h3>
                                <span class="hormark"></span>
                                <span class="htitle">데이터 편집 단계</span>
                            </h3>
                        </article>
                    </dt>
                    <dd>
                        <div class="big_respon1">
                            <article class="big_status flx_jfcent m-t-30">
                                <div class="another_status m-r-40">
                                    <div class="ano_line" >
                                        <p class="left">
                                            <span>유효 그리드 현황 : ${count.validCnt} / ${count.totalCnt} (${count.validCntP}%)</span>
                                            <br/>
                                            <span>미작업 그리드 현황 : ${count.lv0Cnt} / ${count.validCnt} (${count.lv0P}%)</span>
                                            <br/>
                                            <br/>
                                            <span>1단계 그리드 현황 :  ${count.lv1Cnt} / ${count.validCnt} (${count.lv1P}%)</span>
                                            <br/>
                                            <span>2단계 그리드 현황 :  ${count.lv2Cnt} / ${count.validCnt} (${count.lv2P}%)</span>
                                            <br/>
                                            <span>3단계 그리드 현황 :  ${count.lv3Cnt} / ${count.validCnt} (${count.lv3P}%)</span>
                                            <br/>
                                            <span>4단계 그리드 현황 :  ${count.lv4Cnt} / ${count.validCnt} (${count.lv4P}%)</span>
                                        </p>
                                    </div>
                                </div>
                            </article>
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
                                <span class="htitle">현장 실사 단계</span>
                            </h3>
                        </article>
                    </dt>
                    <dd>
                        <div class="big_respon1">
                            <article class="big_status flx_jfcent m-t-30">
                                <div class="another_status m-r-40">
                                    <div class="ano_line" >
                                        <p class="left">
                                            <span>1차 실사 그리드 현황 : ${count.insp1Cnt} / ${count.insp1TotalCnt} (${count.insp1P}%)</span>
                                            <br/>
                                            <span>2차 실사 그리드 현황 : ${count.insp2Cnt} / ${count.insp2TotalCnt} (${count.insp2P}%)</span>
                                            <br/>
                                        </p>
                                    </div><!--ano_line-->
                                </div><!--another_status-->
                            </article><!--big_status-->
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
                                <span class="htitle">데이터 검증 단계</span>
                            </h3>
                        </article>
                    </dt>
                    <dd>
                        <div class="big_respon1">
                            <article class="big_status flx_jfcent m-t-30">
                                <div class="another_status m-r-40">
                                    <div class="ano_line" >
                                        <p class="left">
                                            <span>1차 검증 그리드 현황 : ${count.vrf1Cnt} / ${count.validCnt} (${count.vrf1P}%)</span>
                                            <br/>
                                            <span>2차 검증 그리드 현황 : ${count.vrf2Cnt} / ${count.validCnt} (${count.vrf2P}%)</span>
                                            <br/>
                                        </p>
                                    </div><!--ano_line-->
                                </div><!--another_status-->
                            </article><!--big_status-->
                        </div>
                    </dd>
                </dl><!-- dsconts -->
            </div><!-- col-lg-12 -->
        </div><!--row-->
    </section><!-- content -->
</div>

<%--<script src="${pageContext.request.contextPath}/resources/js/main/index.js" type="text/javascript"></script>--%>
