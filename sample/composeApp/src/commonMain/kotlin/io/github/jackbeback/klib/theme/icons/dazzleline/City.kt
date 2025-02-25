package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.City: ImageVector
    get() {
        if (_City != null) {
            return _City!!
        }
        _City = ImageVector.Builder(
            name = "City",
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
                moveTo(7f, 9f)
                horizontalLineTo(7.01f)
                moveTo(7f, 13f)
                horizontalLineTo(7.01f)
                moveTo(7f, 17f)
                horizontalLineTo(7.01f)
                moveTo(15f, 7f)
                horizontalLineTo(15.01f)
                moveTo(15f, 11f)
                horizontalLineTo(15.01f)
                moveTo(15f, 15f)
                horizontalLineTo(15.01f)
                moveTo(18f, 14f)
                horizontalLineTo(18.01f)
                moveTo(18f, 18f)
                horizontalLineTo(18.01f)
                moveTo(9f, 5f)
                horizontalLineTo(4f)
                curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(9f)
                moveTo(12f, 4.6f)
                verticalLineTo(19.4f)
                curveTo(12f, 19.96f, 12f, 20.24f, 12.109f, 20.454f)
                curveTo(12.205f, 20.642f, 12.358f, 20.795f, 12.546f, 20.891f)
                curveTo(12.76f, 21f, 13.04f, 21f, 13.6f, 21f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 21f, 20.24f, 21f, 20.454f, 20.891f)
                curveTo(20.642f, 20.795f, 20.795f, 20.642f, 20.891f, 20.454f)
                curveTo(21f, 20.24f, 21f, 19.96f, 21f, 19.4f)
                verticalLineTo(11.5f)
                curveTo(21f, 11.034f, 21f, 10.801f, 20.924f, 10.617f)
                curveTo(20.822f, 10.372f, 20.628f, 10.178f, 20.383f, 10.076f)
                curveTo(20.199f, 10f, 19.966f, 10f, 19.5f, 10f)
                curveTo(19.034f, 10f, 18.801f, 10f, 18.617f, 9.924f)
                curveTo(18.372f, 9.822f, 18.178f, 9.628f, 18.076f, 9.383f)
                curveTo(18f, 9.199f, 18f, 8.966f, 18f, 8.5f)
                verticalLineTo(4.6f)
                curveTo(18f, 4.04f, 18f, 3.76f, 17.891f, 3.546f)
                curveTo(17.795f, 3.358f, 17.642f, 3.205f, 17.454f, 3.109f)
                curveTo(17.24f, 3f, 16.96f, 3f, 16.4f, 3f)
                horizontalLineTo(13.6f)
                curveTo(13.04f, 3f, 12.76f, 3f, 12.546f, 3.109f)
                curveTo(12.358f, 3.205f, 12.205f, 3.358f, 12.109f, 3.546f)
                curveTo(12f, 3.76f, 12f, 4.04f, 12f, 4.6f)
                close()
            }
        }.build()

        return _City!!
    }

@Suppress("ObjectPropertyName")
private var _City: ImageVector? = null
