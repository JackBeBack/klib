package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HexagonExclamation: ImageVector
    get() {
        if (_HexagonExclamation != null) {
            return _HexagonExclamation!!
        }
        _HexagonExclamation = ImageVector.Builder(
            name = "HexagonExclamation",
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
                moveTo(12f, 8f)
                verticalLineTo(13f)
                moveTo(12f, 16f)
                horizontalLineTo(12.01f)
                moveTo(8.848f, 20.66f)
                horizontalLineTo(15.153f)
                curveTo(15.825f, 20.66f, 16.162f, 20.66f, 16.463f, 20.563f)
                curveTo(16.73f, 20.476f, 16.975f, 20.334f, 17.184f, 20.147f)
                curveTo(17.419f, 19.935f, 17.587f, 19.643f, 17.924f, 19.06f)
                lineTo(21.076f, 13.6f)
                curveTo(21.413f, 13.017f, 21.581f, 12.726f, 21.647f, 12.416f)
                curveTo(21.705f, 12.142f, 21.705f, 11.858f, 21.647f, 11.584f)
                curveTo(21.581f, 11.274f, 21.413f, 10.983f, 21.076f, 10.4f)
                lineTo(17.924f, 4.94f)
                curveTo(17.587f, 4.357f, 17.419f, 4.066f, 17.184f, 3.854f)
                curveTo(16.975f, 3.666f, 16.73f, 3.524f, 16.463f, 3.438f)
                curveTo(16.162f, 3.34f, 15.825f, 3.34f, 15.153f, 3.34f)
                horizontalLineTo(8.848f)
                curveTo(8.174f, 3.34f, 7.838f, 3.34f, 7.537f, 3.438f)
                curveTo(7.27f, 3.524f, 7.025f, 3.666f, 6.816f, 3.854f)
                curveTo(6.581f, 4.066f, 6.413f, 4.357f, 6.076f, 4.94f)
                lineTo(2.924f, 10.4f)
                curveTo(2.587f, 10.983f, 2.419f, 11.274f, 2.353f, 11.584f)
                curveTo(2.295f, 11.858f, 2.295f, 12.142f, 2.353f, 12.416f)
                curveTo(2.419f, 12.726f, 2.587f, 13.017f, 2.924f, 13.6f)
                lineTo(6.076f, 19.06f)
                curveTo(6.413f, 19.643f, 6.581f, 19.935f, 6.816f, 20.147f)
                curveTo(7.025f, 20.334f, 7.27f, 20.476f, 7.537f, 20.563f)
                curveTo(7.838f, 20.66f, 8.174f, 20.66f, 8.848f, 20.66f)
                close()
            }
        }.build()

        return _HexagonExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _HexagonExclamation: ImageVector? = null
