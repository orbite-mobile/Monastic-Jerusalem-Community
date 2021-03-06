/*
 * Copyright (c) 2017. All Rights Reserved. Michal Jankowski orbitemobile.pl
 */
package pl.orbitemobile.wspolnoty.activities.article

import pl.orbitemobile.wspolnoty.R
import pl.orbitemobile.wspolnoty.activities.mvp.MonasticMVPActivity

class ArticleActivity : MonasticMVPActivity(R.drawable.article_top) {

    private fun initPresenterView(): Pair<ArticlePresenter, ArticleView> = init(R.id.fragment_container)

    override fun initPresenter() {
        presenter = initPresenterView().first
    }
}
