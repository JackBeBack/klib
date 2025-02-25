package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BuildingLock: ImageVector
    get() {
        if (_BuildingLock != null) {
            return _BuildingLock!!
        }
        _BuildingLock = ImageVector.Builder(
            name = "BuildingLock",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                curveTo(11f, 16.895f, 10.105f, 16f, 9f, 16f)
                curveTo(7.895f, 16f, 7f, 16.895f, 7f, 18f)
                verticalLineTo(21f)
                close()
                moveTo(7f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(4.6f)
                curveTo(3f, 4.04f, 3f, 3.76f, 3.109f, 3.546f)
                curveTo(3.205f, 3.358f, 3.358f, 3.205f, 3.546f, 3.109f)
                curveTo(3.76f, 3f, 4.04f, 3f, 4.6f, 3f)
                horizontalLineTo(13.4f)
                curveTo(13.96f, 3f, 14.24f, 3f, 14.454f, 3.109f)
                curveTo(14.642f, 3.205f, 14.795f, 3.358f, 14.891f, 3.546f)
                curveTo(15f, 3.76f, 15f, 4.04f, 15f, 4.6f)
                verticalLineTo(12f)
                moveTo(6f, 7f)
                horizontalLineTo(7f)
                moveTo(6f, 10f)
                horizontalLineTo(7f)
                moveTo(11f, 10f)
                horizontalLineTo(12f)
                moveTo(11f, 13f)
                horizontalLineTo(12f)
                moveTo(6f, 13f)
                horizontalLineTo(7f)
                moveTo(11f, 7f)
                horizontalLineTo(12f)
                moveTo(16f, 18f)
                verticalLineTo(17f)
                curveTo(16f, 15.895f, 16.895f, 15f, 18f, 15f)
                curveTo(19.105f, 15f, 20f, 15.895f, 20f, 17f)
                verticalLineTo(18f)
                moveTo(16.5f, 21f)
                horizontalLineTo(19.5f)
                curveTo(19.966f, 21f, 20.199f, 21f, 20.383f, 20.924f)
                curveTo(20.628f, 20.822f, 20.822f, 20.628f, 20.924f, 20.383f)
                curveTo(21f, 20.199f, 21f, 19.966f, 21f, 19.5f)
                curveTo(21f, 19.034f, 21f, 18.801f, 20.924f, 18.617f)
                curveTo(20.822f, 18.372f, 20.628f, 18.178f, 20.383f, 18.076f)
                curveTo(20.199f, 18f, 19.966f, 18f, 19.5f, 18f)
                horizontalLineTo(16.5f)
                curveTo(16.034f, 18f, 15.801f, 18f, 15.617f, 18.076f)
                curveTo(15.372f, 18.178f, 15.178f, 18.372f, 15.076f, 18.617f)
                curveTo(15f, 18.801f, 15f, 19.034f, 15f, 19.5f)
                curveTo(15f, 19.966f, 15f, 20.199f, 15.076f, 20.383f)
                curveTo(15.178f, 20.628f, 15.372f, 20.822f, 15.617f, 20.924f)
                curveTo(15.801f, 21f, 16.034f, 21f, 16.5f, 21f)
                close()
            }
        }.build()

        return _BuildingLock!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingLock: ImageVector? = null
