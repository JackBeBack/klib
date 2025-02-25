package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CandleStand: ImageVector
    get() {
        if (_CandleStand != null) {
            return _CandleStand!!
        }
        _CandleStand = ImageVector.Builder(
            name = "CandleStand",
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
                moveTo(3f, 21f)
                horizontalLineTo(17f)
                lineTo(17f, 16f)
                curveTo(17f, 14.895f, 17.895f, 14f, 19f, 14f)
                curveTo(20.105f, 14f, 21f, 14.895f, 21f, 16f)
                moveTo(12f, 21f)
                verticalLineTo(16.915f)
                moveTo(7f, 21f)
                verticalLineTo(16.915f)
                moveTo(6.6f, 11f)
                horizontalLineTo(12.4f)
                curveTo(12.96f, 11f, 13.24f, 11f, 13.454f, 11.109f)
                curveTo(13.642f, 11.205f, 13.795f, 11.358f, 13.891f, 11.546f)
                curveTo(14f, 11.76f, 14f, 12.04f, 14f, 12.6f)
                lineTo(14f, 15.5f)
                curveTo(14f, 16.328f, 13.328f, 17f, 12.5f, 17f)
                curveTo(11.672f, 17f, 11f, 16.328f, 11f, 15.5f)
                verticalLineTo(15f)
                curveTo(11f, 14.448f, 10.552f, 14f, 10f, 14f)
                horizontalLineTo(9f)
                curveTo(8.448f, 14f, 8f, 14.448f, 8f, 15f)
                verticalLineTo(15.5f)
                curveTo(8f, 16.328f, 7.328f, 17f, 6.5f, 17f)
                curveTo(5.672f, 17f, 5f, 16.328f, 5f, 15.5f)
                verticalLineTo(12.6f)
                curveTo(5f, 12.04f, 5f, 11.76f, 5.109f, 11.546f)
                curveTo(5.205f, 11.358f, 5.358f, 11.205f, 5.546f, 11.109f)
                curveTo(5.76f, 11f, 6.04f, 11f, 6.6f, 11f)
                close()
                moveTo(9.5f, 8f)
                curveTo(10.397f, 8f, 11.156f, 7.41f, 11.41f, 6.596f)
                curveTo(11.527f, 6.22f, 11.383f, 5.825f, 11.164f, 5.496f)
                lineTo(9.5f, 3f)
                lineTo(7.836f, 5.496f)
                curveTo(7.617f, 5.825f, 7.473f, 6.22f, 7.59f, 6.596f)
                curveTo(7.844f, 7.41f, 8.603f, 8f, 9.5f, 8f)
                close()
            }
        }.build()

        return _CandleStand!!
    }

@Suppress("ObjectPropertyName")
private var _CandleStand: ImageVector? = null
